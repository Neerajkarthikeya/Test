package JFSDS25.JFSDS25_Hibernatelab;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Agg {

	public static void main(String args[]) {
	    Configuration cfg=new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		Transaction t=s.beginTransaction();
		String hql = "SELECT COUNT(*), SUM(s.cgpa), AVG(s.cgpa), MIN(s.cgpa), MAX(s.cgpa) FROM Student s";
		Query query = s.createQuery(hql);
		List<Object[]> results = query.list();
		Object[] row = results.get(0);
		System.out.println("Count: " + row[0] + ", Sum: " + row[1] + ", Avg: " + row[2] + ", Min: " + row[3] + ", Max: " + row[4]);
	}

}
