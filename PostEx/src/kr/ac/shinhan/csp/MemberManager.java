package kr.ac.shinhan.csp;

import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class MemberManager {
	
	
	public static Member addMember(String name, String hak_id , String phone, String mail, String kakao_id, String team, String git_id) 
 	{ 
 		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager(); 
 		Member m = new Member(name, hak_id, phone, mail, kakao_id, team, git_id); 
 		pm.makePersistent(m); 
 		 
 		return m; 
 		
 	} 
	
 	public static Member getMember(String key) 
 	{ 
 		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager(); 
 		Member m = pm.getObjectById(Member.class,key); 
 		 
 		return m; 
	} 
 	 
 	public static void deleteMember(String key) 
	{ 
 		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager(); 
		Member m = MemberManager.getMember(key); 
		pm.deletePersistent(m); 
	} 
 
 	public static List<Member> getMemberByName(String name, String hak_id , String phone, String mail, String kakao_id, String team, String git_id) 
 	{ 
 		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager(); 
 		Query qry = pm.newQuery(Member.class); 
 		qry.setFilter("name == nameParam");
 		qry.declareParameters("String nameParam");
 		qry.setFilter("hak_id == hak_idParam");
 		qry.declareParameters("String hak_idParam");
 		qry.setFilter("phone == phoneParam");
 		qry.declareParameters("String phoneParam");
 		qry.setFilter("mail == mailParam");
 		qry.declareParameters("String mailParam");
 		qry.setFilter("kakao_id == kakao_idParam");
 		qry.declareParameters("String kakao_idParam");
 		qry.setFilter("team == teamParam");
 		qry.declareParameters("String teamParam");
 		qry.setFilter("git_id == git_idParam");
 		qry.declareParameters("String git_idParam");
 		
 		List<Member> memberList = (List<Member>) qry.execute(name);
 		
 		return memberList; 
 	} 
 
	public static List<Member> getAllMembers() 
	{ 
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager(); 
 		Query qry = pm.newQuery(Member.class); 
 		List<Member> memberList = (List<Member>) qry.execute(); 

		return memberList;
	}

	public static Member getMemberBykey(String id) {
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager();
		Member m = pm.getObjectById(Member.class,id);
		return m;
	}
	
}
