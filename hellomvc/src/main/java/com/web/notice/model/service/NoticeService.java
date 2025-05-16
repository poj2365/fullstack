package com.web.notice.model.service;

import java.sql.Connection;
import java.util.List;

import com.web.common.JDBCTemplate;
import com.web.notice.model.dao.NoticeDao;
import com.web.notice.model.dto.Notice;

public class NoticeService {
	private static final NoticeService SERVICE = new NoticeService();
	private NoticeDao dao = NoticeDao.noticeDao();
	private Connection conn = null;
	
	private NoticeService() {
	}
	
	public static NoticeService NoticeService() {
		return SERVICE;
	}

	public List<Notice> searchNoticeAll(int cPage, int numPerpage) {
		conn = JDBCTemplate.getConnection();
		List<Notice> n = dao.searchNoticeAll(conn, cPage, numPerpage);
		JDBCTemplate.close(conn);
		return n;
	}

	public int noticeCount() {
		conn = JDBCTemplate.getConnection();
		int totalData = dao.noticeCount(conn);
		JDBCTemplate.close(conn);
		return totalData;
	}
	
	
}
