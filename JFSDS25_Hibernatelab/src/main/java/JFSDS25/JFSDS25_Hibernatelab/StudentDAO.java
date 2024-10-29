package JFSDS25.JFSDS25_Hibernatelab;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDAO {

	public void insertStudent() {
		Scanner scanner=new Scanner(System.in);
		char response;
		do {
			Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory sf=cfg.buildSessionFactory();
			Session s=sf.openSession();
			Transaction t=s.beginTransaction();
			Student student=new Student();
			System.out.print("Enter student id: ");
			student.setId(scanner.nextInt());
			scanner.nextLine();
			System.out.print("Enter student name: ");
            student.setName(scanner.nextLine());
            System.out.print("Enter gender: ");
            student.setGender(scanner.nextLine());
            System.out.print("Enter department: ");
            student.setDepartment(scanner.nextLine());
            System.out.print("Enter program: ");
            student.setProgram(scanner.nextLine());
            System.out.print("Enter date of birth (DD-MM-YYYY): ");
            student.setDateOfBirth(scanner.nextLine());
            System.out.print("Enter contact number: ");
            student.setContactNumber(scanner.nextLine());
            System.out.print("Enter graduation status: ");
            student.setGraduationStatus(scanner.nextLine());
            System.out.print("Enter CGPA: ");
            student.setCgpa(scanner.nextDouble());
            System.out.print("Enter number of backlogs: ");
            student.setNoOfBacklogs(scanner.nextInt());
            scanner.nextLine(); 
            s.save(student);
            t.commit();
            s.close();
            System.out.print("Do you want to insert another student (yes/no)? ");
            response = scanner.nextLine().charAt(0);
		}while (response == 'y' || response == 'Y');
	}
	public Student fetchStudentById(int id) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Student student = s.get(Student.class, id);
	    s.close();
	    return student;
	}
	public void updateStudent(int id,Student updatedStudent) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Student existingStudent = s.get(Student.class, id);
		if (existingStudent != null) {
	        existingStudent.setName(updatedStudent.getName());
	        existingStudent.setGender(updatedStudent.getGender());
	        existingStudent.setDepartment(updatedStudent.getDepartment());
	        existingStudent.setProgram(updatedStudent.getProgram());
	        existingStudent.setDateOfBirth(updatedStudent.getDateOfBirth());
	        existingStudent.setContactNumber(updatedStudent.getContactNumber());
	        existingStudent.setGraduationStatus(updatedStudent.getGraduationStatus());
	        existingStudent.setCgpa(updatedStudent.getCgpa());
	        existingStudent.setNoOfBacklogs(updatedStudent.getNoOfBacklogs());

	        s.update(existingStudent);
	        t.commit();
		}
		s.close();
	}
	public void deleteStudentById(int id) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Student student = s.get(Student.class, id);
	    if (student != null) {
	        s.delete(student);
	        t.commit();
	    }
	    s.close();
	}

}
