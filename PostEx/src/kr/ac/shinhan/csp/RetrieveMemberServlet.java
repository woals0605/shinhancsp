package kr.ac.shinhan.csp;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RetrieveMemberServlet extends HttpServlet{ 
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{ 
 		 
	List<Member> memberList = MemberManager.getAllMembers(); 
 		 
 		resp.getWriter().println("<HTML>"); 
 		resp.getWriter().println("<body>"); 
 		resp.getWriter().println("<table border = 1>"); 
 		for(Member m :memberList) 
 		{ 
 			resp.getWriter().println("<tr>"); 
 			resp.getWriter().println("<td>"+"<a href = '/ReadMemberServlet?name="+m.getId()+"'>"+m.getName()+"</a>"+"</td><td>"+m.gethak_id()+"</td><td>"+m.getphone()+"</td><td>"+m.getmail()+"</td><td>"+m.getkakao_id()+"</td><td>"+m.getteam()+"</td><td>"+m.getgit_id()+"</td>"); 
 			resp.getWriter().println("</tr>"); 
 		} 
 		resp.getWriter().println("</table>"); 
 		resp.getWriter().println("</body>"); 
 		resp.getWriter().println("</HTML>"); 
 		 
 	} 
	

}
