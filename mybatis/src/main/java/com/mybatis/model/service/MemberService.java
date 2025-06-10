package com.mybatis.model.service;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.model.dao.MemberDao;
import com.mybatis.model.dto.Member;

import static com.mybatis.common.SqlSessionTemplate.getSession;

import java.util.List;
import java.util.Map;

public class MemberService {

	private MemberDao dao = new MemberDao();
	
	public int insertMember() {
		SqlSession session = getSession();
		int result = dao.inserMember(session);
		if(result>0) session.commit();
		else session.rollback();
		session.close();
		return result;
	}

	public int insertMember(String userId) {
		SqlSession session = getSession();
		int result = dao.inserMember(session,userId);
		if(result>0) session.commit();
		else session.rollback();
		session.close();
		return result;
	}

	public int insertMember(Member m) {
		SqlSession session = getSession();
		int result = dao.insertMember(session,m);
		if(result>0) session.commit();
		else session.rollback();
		session.close();
		return result;
	}

	public int insertMemberAll(Map<String, Object> param) {
		SqlSession session = getSession();
		int result = dao.insertMemberAll(session,param);
		if(result>0) session.commit();
		else session.rollback();
		session.close();
		return result;
	}

	public int selectMemberCount() {
		SqlSession session = getSession();
		int count = dao.selectMemberCount(session);
		session.close();
		return count;
	}

	public Member searchMember(String userId) {
		SqlSession session = getSession();
		Member m = dao.searchMember(session,userId);
		session.close();
		return m;
	}

	public List<Member> searchMemberByName(String userName) {
		SqlSession session = getSession();
		List<Member> memberList = dao.searchMemberByName(session,userName);
		session.close();
		return memberList;
	}

	public List<Map> selectMemberAll() {
		SqlSession session = getSession();
		List<Map> members = dao.selectMemberAll(session);
		session.close();
		return members;
	}

	public List<Member> selectMemberAllPage(int cPage, int numPerPage) {
		SqlSession session = getSession();
		List<Member> members = dao.selectMemberAllPage(session,cPage,numPerPage);
		session.close();
		return members;
	}
}
