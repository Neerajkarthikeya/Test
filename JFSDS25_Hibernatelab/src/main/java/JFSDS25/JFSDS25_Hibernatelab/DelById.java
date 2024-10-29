package JFSDS25.JFSDS25_Hibernatelab;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DelById {

	public static void main(String args[]) {
	    Configuration cfg=new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		Transaction t=s.beginTransaction();
		String hql = "DELETE FROM Student s WHERE s.id = :studentId";
		Query query = s.createQuery(hql);
		query.setParameter("studentId", 30101);
		int result = query.executeUpdate();
		
	}

}
