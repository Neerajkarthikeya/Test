package JFSDS25.JFSDS25_Hibernatelab;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RetSpecCol {
	public static void main(String args[]) {
	    Configuration cfg=new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		Transaction t=s.beginTransaction();
		String hql = "SELECT s.name, s.cgpa FROM Student s";
		Query query = s.createQuery(hql);
		List<Object[]> students = query.list();
		for (Object[] student : students) {
		    System.out.println("Name: " + student[0] + ", CGPA: " + student[1]);
		}
	}

}
