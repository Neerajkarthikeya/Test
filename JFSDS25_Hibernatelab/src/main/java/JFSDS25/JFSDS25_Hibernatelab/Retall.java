package JFSDS25.JFSDS25_Hibernatelab;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import JFSDS25.JFSDS25_Hibernatelab.Student;

public class Retall {
public static void main(String args[]) {
    Configuration cfg=new Configuration();
	
	cfg.configure("hibernate.cfg.xml");
	
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
	
	Transaction t=s.beginTransaction();
	String hql = "FROM Student";
	Query query = s.createQuery(hql);
	List<Student> students = query.list();
    Iterator<Student> i=students.iterator();
	
	while(i.hasNext()) {
		Student st=i.next();
		System.out.println(st.getId());
		System.out.println(st.getName());
		System.out.println(st.getGender());
		System.out.println(st.getDepartment());
		System.out.println(st.getProgram());
		System.out.println(st.getDateOfBirth());
		System.out.println(st.getContactNumber());
		System.out.println(st.getGraduationStatus());
		System.out.println(st.getCgpa());
		System.out.println(st.getNoOfBacklogs());
	}
}

}
