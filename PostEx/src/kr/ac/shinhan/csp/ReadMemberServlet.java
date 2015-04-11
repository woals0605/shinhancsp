package kr.ac.shinhan.csp;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadMemberServlet extends HttpServlet{ 
 	public void doGet(HttpServletRequest req, HttpServletResponse resp) 
 			throws IOException { 
 		String id = req.getParameter("name");
 		
 		Member m = MemberManager.getMemberBykey(id);
 		
 		resp.setCharacterEncoding("UTF-8"); 
 		resp.setContentType("text/plain");  
 		 
 		resp.getWriter().println("<html>"); 
 		resp.getWriter().println("<body>"); 
 		resp.getWriter().println("이름 : "+m.getName() +"<br>");
 		resp.getWriter().println("학번 : "+m.gethak_id() +"<br>"); 
 		resp.getWriter().println("Long ID : "+m.getId() +"<br>"); 
 		 
 		resp.getWriter().println("</body>"); 
 		resp.getWriter().println("</html>"); 
 		 
 	} 

}
