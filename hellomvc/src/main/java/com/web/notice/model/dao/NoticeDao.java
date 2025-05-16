package com.web.notice.model.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.web.common.JDBCTemplate;
import com.web.model.dto.Member;
import com.web.notice.model.dto.Notice;

public class NoticeDao {
	private Properties sql = new Properties();
	private PreparedStatement pstmt = null;	
	private ResultSet rs = null;	
	private static final NoticeDao dao = new NoticeDao();
	private NoticeDao() {
		String path = NoticeDao.class.getResource("/sql/notice_sql.properties").getPath();
		try(FileReader fr = new FileReader(path)){
			sql.load(fr);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static NoticeDao noticeDao() {
		return dao;
	}

	public List<Notice> searchNoticeAll(Connection conn, int cPage, int numPerpage) {
		List<Notice> list = new ArrayList<Notice>();
		try {
			pstmt = conn.prepareStatement(sql.getProperty("searchNoticeAll"));
			pstmt.setInt(1,(cPage-1)*numPerpage+1);
			pstmt.setInt(2, cPage*numPerpage);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(getNotice(rs));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(pstmt);
		}
		return list;
	}
	
	private Notice getNotice(ResultSet rs) throws SQLException{
		return Notice.builder()
				.noticeNo(rs.getInt("notice_no"))
				.noticeTitle(rs.getString("notice_title"))
				.noticeWriter(rs.getString("notice_writer"))
				.noticeContent(rs.getString("notice_content"))
				.noticeDate(rs.getDate("notice_date"))
				.filepath(rs.getString("filepath"))
				.status(rs.getString("status"))
				.build();
	}

	public int noticeCount(Connection conn) {
		int result=0;
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql.getProperty("noticeCount"));
			if(rs.next()) result = rs.getInt(1);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(stmt);
		}
		return result;
	}

}
