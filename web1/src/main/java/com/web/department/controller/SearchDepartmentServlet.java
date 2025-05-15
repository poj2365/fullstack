package com.web.department.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.model.dto.Department;

/**
 * Servlet implementation class SearchDepartmentServlet
 */
@WebServlet("/dept/searchdept.do")
public class SearchDepartmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchDepartmentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// BS 계정의 department 테이블에 있는 데이터를 가져와 페이지에 출력해주는 기능
		// 여기서부터 dto 기능
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Department> depts = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"BS","BS"
					);
			pstmt=conn.prepareStatement("SELECT * FROM DEPARTMENT");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String deptId = rs.getString("dept_id");
				String deptTitle = rs.getString("dept_title");
				String locationId = rs.getString("location_id");
				Department dept = Department.builder()
						.deptId(deptId)
						.deptTitle(deptTitle)
						.locationId(locationId)
						.build();
				depts.add(dept);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();				
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
		request.setAttribute("depts", depts);
		
		RequestDispatcher rd = request.getRequestDispatcher("/view/dept.do");
		rd.forward(request, response);
		
		// session request context 차이 생명주기 request -> 서비스가 끝나면 가지고 있을 필요가 없음
		// 만약 로직이 끝나고 계속 확인이 필요하다 -> session context
		// 근데 servlet context는 잘 안씀
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
