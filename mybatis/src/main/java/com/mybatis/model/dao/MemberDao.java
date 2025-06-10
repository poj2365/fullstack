package com.mybatis.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.dto.Member;

public class MemberDao {

	public int inserMember(SqlSession session) {
		// sql문을 실행
		// 1. mapper 파일 필요
		// 2. SqlSession 객체가 제공하는 메소드를 이용해서 mapper에 설정된 sql문을 실행
		// selectOne, selectList, insert, update, delete
		// 매개변수 -> String으로 mappernamespace.sql태그id
		int result = session.insert("member.insertMember");
		return result;
	}

	public int inserMember(SqlSession session, String userId) {
		// 매개변수를 sql문에 이용하기
		return session.insert("member.insertMemberParam",userId);
	}

	public int insertMember(SqlSession session, Member m) {
		return session.insert("member.insertMemberParam2",m);
	}

	public int insertMemberAll(SqlSession session, Map<String, Object> param) {
		return session.insert("member.insertMemberAll",param);
	}

	public int selectMemberCount(SqlSession session) {
		// select 문 실행하는 메소드 2가지가 있음
		// selectOne("state"[,Object]) : resultSet의 결과(row)가 0~1개
		// selectList() : resultSet의 결과(row)가 2개 이상 
		return session.selectOne("member.selectMemberCount");
	}

	public Member searchMember(SqlSession session, String userId) {
		return session.selectOne("member.searchMember",userId);
	}

	public List<Member> searchMemberByName(SqlSession session, String userName) {
		return session.selectList("member.searchMemberByName",userName);
	}

	public List<Map> selectMemberAll(SqlSession session) {
		return session.selectList("member.selectMemberAll");
	}

	public List<Member> selectMemberAllPage(SqlSession session, int cPage, int numPerPage) {
		// 페이징 처리 객체 이용할 수 있음
		// RowBounds 객체
		// 매개변수 있는 생성자를 이용해서 생성
		// selectList 메소드의 세번째 매개변수로 전달해줌
		// 1. row의 시작 위치를 지정하는 값(offset) -> (cPage-1)*numPerPage
		// 2. 범위(간격) -> numPerPage
		// selectList 오버로딩 중에 3번째는 무조건 3개의 매개변수를 줘야됨
		RowBounds rb = new RowBounds((cPage-1)*numPerPage,numPerPage);
		return session.selectList("member.selectMemberAllPage",null,rb);
	}

}
