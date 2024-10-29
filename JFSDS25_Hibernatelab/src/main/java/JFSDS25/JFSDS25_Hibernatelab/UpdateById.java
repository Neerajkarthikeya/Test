package JFSDS25.JFSDS25_Hibernatelab;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateById {

	public static void main(String args[]) {
	    Configuration cfg=new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		Transaction t=s.beginTransaction();
		String hql = "UPDATE Student s SET s.name = :name, s.cgpa = :cgpa WHERE s.id = :studentId";
		Query query = s.createQuery(hql);
		query.setParameter("name", "uday");
		query.setParameter("cgpa", 9.74);
		query.setParameter("studentId", 30102);
		int result = query.executeUpdate();
	}


}
