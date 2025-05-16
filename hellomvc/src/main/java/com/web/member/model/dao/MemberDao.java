package com.web.member.model.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.Properties;

import com.web.common.JDBCTemplate;
import com.web.member.model.dao.MemberDao;
import com.web.model.dto.Member;

public class MemberDao {
	
	private Properties sql = new Properties();
	private PreparedStatement pstmt = null;	
	private ResultSet rs = null;	
	private static final MemberDao dao = new MemberDao();
	private MemberDao() {
		String path = MemberDao.class.getResource("/sql/member_sql.properties").getPath();
		try(FileReader fr = new FileReader(path)){
			sql.load(fr);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static MemberDao memberDao() {
		return dao;
	}

	
	public int insertMember(Connection conn, Member m) {
		int result = 0;
		try{
			pstmt=conn.prepareStatement(sql.getProperty("insertMember"));
			pstmt.setString(1, m.getUserId());
			pstmt.setString(2, m.getPassword());
			pstmt.setString(3, m.getUserName());
			pstmt.setString(4, m.getGender());
			pstmt.setInt(5, m.getAge());
			pstmt.setString(6, m.getEmail());
			pstmt.setString(7, m.getPhone());
			pstmt.setString(8, m.getAddress());
			pstmt.setString(9, String.join(",",m.getHobby()));
			result = pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(pstmt);
		}
		return result;
	}
	
	public Member idDuplicate(Connection conn, String id) {
		Member m= null;
		try {
			pstmt=conn.prepareStatement(sql.getProperty("searchById"));
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) m=getMember(rs);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(pstmt);
		}
		return m;
	}
	
	private Member getMember(ResultSet rs) throws SQLException{
		String hobby = rs.getString("hobby");
		return Member.builder()
				.userId(rs.getString("userId"))
				.password(rs.getString("password"))
				.userName(rs.getString("userName"))
				.gender(rs.getString("gender"))
				.age(rs.getInt("age"))
				.email(rs.getString("email"))
				.phone(rs.getString("phone"))
				.address(rs.getString("address"))
				.hobby(hobby!=null?hobby.split(","):new String[] {})
				.enrollDate(rs.getDate("enrolldate"))
				.build();
	}
}
