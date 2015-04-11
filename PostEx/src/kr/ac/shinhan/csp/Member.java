package kr.ac.shinhan.csp;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import javax.jdo.annotations.IdentityType;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Member {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
	
	@Persistent
	private String name;
	@Persistent 
	private String hak_id; 	
	@Persistent 
	private String phone;	
	@Persistent 
	private String mail;	
	@Persistent 
	private String kakao_id;	
	@Persistent 
	private String team;
	@Persistent 
	private String git_id;
	
	
	public Member(String name , String hak_id, String phone, String mail, String kakao_id, String team, String git_id) { 
		super();
		this.name = name;
		this.hak_id = hak_id; 
		this.phone = phone;
		this.mail = mail;
		this.kakao_id = kakao_id;
		this.team = team;
		this.git_id = git_id;
	
		
	} 
	public String getName() { 
		return name;
	} 
	public void setName(String name) { 
		this.name = name; 
	}
	public String gethak_id() { 
		return hak_id; 
	} 
	public void sethak_id(String hak_id) { 
		this.hak_id = hak_id; 
	}
	public String getphone() { 
		return phone; 
	} 
	public void setphone(String phone) { 
		this.phone = phone; 
	}
	public String getmail() { 
		return mail; 
	} 
	public void setmail(String mail) { 
		this.mail = mail;
	} 
	public String getkakao_id() { 
		return kakao_id; 
	} 
	public void setkakao_id(String kakao_id) { 
		this.kakao_id = kakao_id; 
	} 
	public String getteam() { 
		return team; 
	} 
	public void setteam(String team) { 
		this.team = team;
	} 
	public String getgit_id() { 
		return git_id; 
	} 
	public void setgit_id(String git_id) { 
		this.git_id = git_id; 
	}
	public Long getId(){
		return id;
	}

}
