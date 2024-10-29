package JFSDS25.JFSDS25_Hibernatelab;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RetNames {

	public static void main(String args[]) {
	    Configuration cfg=new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		Transaction t=s.beginTransaction();
		String hql = "SELECT s.name FROM Student s WHERE s.cgpa > 7";
		Query query = s.createQuery(hql);
		List<String> names = query.list();
		Iterator<String> i=names.iterator();
		
		while(i.hasNext()) {
			String st=i.next();
			System.out.println(st);
		}
	}

}
