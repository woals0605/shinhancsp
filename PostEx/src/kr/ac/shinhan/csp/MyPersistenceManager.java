package kr.ac.shinhan.csp;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManager;

public class MyPersistenceManager {
	public static PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager();
	public static PersistenceManager getManager() 
 	{
 		return pm;
 	}

}
