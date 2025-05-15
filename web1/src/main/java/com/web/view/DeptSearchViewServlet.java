package com.web.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.model.dto.Department;

/**
 * Servlet implementation class DeptSearchViewServlet
 */
@WebServlet("/view/dept.do")
public class DeptSearchViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeptSearchViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>");
		out.print("부서조회결과");
		out.print("</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h3>부서조회결과</h3>");
		out.print("<table>");
		out.print("<tr>");
		out.print("<td>부서코드</td><td>부서명</td><td>지역코드</td>");
		out.print("</tr>");
		List<Department> depts = (List<Department>)request.getAttribute("depts");
		if(!depts.isEmpty()) {
			for(Department d : depts) {
				out.print("<tr>");
				out.print("<td><a href='/basicweb/searchdeptbyid.do?id="+d.getDeptId()+"'>"+d.getDeptId()+"</a></td>");
				out.print("<td>"+d.getDeptTitle()+"</td>");
				out.print("<td>"+d.getLocationId()+"</td>");
				out.print("</tr>");			
			}
		}else {
			out.print("<tr>");
			out.print("<td colspan='3'>조회결과가 없습니다!.</td>");			
			out.print("</tr>");			
		}
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
