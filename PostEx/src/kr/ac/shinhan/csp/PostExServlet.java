package kr.ac.shinhan.csp;

import java.io.IOException;

@SuppressWarnings("serial")
public class PostExServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		String name = req.getParameter("name");
		String hak_id = req.getParameter("hak_id");
		String phone = req.getParameter("phone");
		String mail = req.getParameter("mail");
		String kakao_id = req.getParameter("kakao_id");
		String team = req.getParameter("team");
		String git_id = req.getParameter("git_id");
		
		//insert into database
		Member tm = new Member(name, hak_id, phone, mail, kakao_id, team, git_id);
		PersistenceManager pm = MyPersistenceManager.getManager();
		pm.makePersistent(tm);
		//response
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/plain");
		
		resp.getWriter().println("<html>");
		resp.getWriter().println("<body>");
		
		resp.getWriter().println("이름 : " + req.getParameter("name")+"</br>");
		resp.getWriter().println("학번 : " + req.getParameter("hak_id")+"</br>");
		resp.getWriter().println("전화번호 : " + req.getParameter("phone")+"</br>");
		resp.getWriter().println("메일 : " + req.getParameter("mail")+"</br>");
		resp.getWriter().println("Kakao : " + req.getParameter("kakao_id")+"</br>");
		resp.getWriter().println("팀장 여부 " + req.getParameter("team")+"</br>");
		resp.getWriter().println("GitHub : " + req.getParameter("git_id")+"</br>");
	
		resp.getWriter().println("</body>");
		resp.getWriter().println("</html>");
	
		String team1 = req.getParameter("team"); 
		if(team1 != null)
			resp.getWriter().println("팀장입니다");
		else
			resp.getWriter().println("팀장 아님.");
	}
}
