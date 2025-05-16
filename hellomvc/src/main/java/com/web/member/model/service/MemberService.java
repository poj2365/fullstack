package com.web.member.model.service;

import java.sql.Connection;

import com.web.common.AESEncryptor;
import com.web.common.JDBCTemplate;
import com.web.member.model.dao.MemberDao;
import com.web.member.model.service.MemberService;
import com.web.model.dto.Member;

public class MemberService {
	private MemberDao dao = MemberDao.memberDao();
	private static final MemberService SERVICE = new MemberService();
	private Connection conn = null;
	
	private MemberService() {}
	
	public static MemberService memberService() {
		return SERVICE;
	}
	
	public int insertMember(Member m) {
		conn=JDBCTemplate.getConnection();
		int result = dao.insertMember(conn, m);
		if(result>0) JDBCTemplate.commit(conn);
		else JDBCTemplate.rollback(conn);
		JDBCTemplate.close(conn);
		return result;
	}

	public Member idDuplicate(String id) {
		conn=JDBCTemplate.getConnection();
		Member m = dao.idDuplicate(conn, id);
		JDBCTemplate.close(conn);
		return m;
	}
	
	public Member login(String id, String password) {
		System.out.println("login");
		conn=JDBCTemplate.getConnection();
		Member m = dao.idDuplicate(conn, id);
		try {
			if(m!=null) {
				String decryptPassword = AESEncryptor.decryptData(m.getPassword());
				if(password.equals(decryptPassword)) {
					System.out.println("password"+password+"decryptPassword : "+decryptPassword);
					return m;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		JDBCTemplate.close(conn);
		return m;
	}
}
