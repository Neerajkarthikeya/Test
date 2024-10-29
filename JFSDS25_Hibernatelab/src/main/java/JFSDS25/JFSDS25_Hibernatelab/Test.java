package JFSDS25.JFSDS25_Hibernatelab;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	StudentDAO dao = new StudentDAO();
	Scanner scanner = new Scanner(System.in);

    int choice;
    do {
        System.out.println("1. Insert Student\n2. Fetch Student by ID\n3. Update Student\n4. Delete Student\n5. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();
        scanner.nextLine(); 
    
	switch (choice) {
    case 1:
        
        dao.insertStudent();
        break;

    case 2:
        
        System.out.print("Enter student ID to fetch: ");
        int fetchId = scanner.nextInt();
        scanner.nextLine();  

        Student fetchedStudent = dao.fetchStudentById(fetchId);
        if (fetchedStudent != null) {
            System.out.println("\nStudent Details:");
            System.out.println(fetchedStudent);
        } else {
            System.out.println("Student not found.");
        }
        break;

    case 3:
        
        System.out.print("Enter student ID to update: ");
        int updateId = scanner.nextInt();
        scanner.nextLine();  

        Student updatedStudent = new Student();
        
        
        System.out.print("Enter updated name: ");
        updatedStudent.setName(scanner.nextLine());
        
        System.out.print("Enter updated gender: ");
        updatedStudent.setGender(scanner.nextLine());
        
        System.out.print("Enter updated department: ");
        updatedStudent.setDepartment(scanner.nextLine());

        System.out.print("Enter updated program: ");
        updatedStudent.setProgram(scanner.nextLine());

        System.out.print("Enter updated date of birth (DD-MM-YYYY): ");
        updatedStudent.setDateOfBirth(scanner.nextLine());

        System.out.print("Enter updated contact number: ");
        updatedStudent.setContactNumber(scanner.nextLine());

        System.out.print("Enter updated graduation status: ");
        updatedStudent.setGraduationStatus(scanner.nextLine());

        System.out.print("Enter updated CGPA: ");
        updatedStudent.setCgpa(scanner.nextDouble());
        scanner.nextLine();  

        System.out.print("Enter updated number of backlogs: ");
        updatedStudent.setNoOfBacklogs(scanner.nextInt());
        scanner.nextLine();  

        
        dao.updateStudent(updateId, updatedStudent);
        break;

    case 4:
        
        System.out.print("Enter student ID to delete: ");
        int deleteId = scanner.nextInt();
        scanner.nextLine();  

        dao.deleteStudentById(deleteId);
        System.out.println("Student with ID " + deleteId + " deleted.");
        break;

    case 5:
        
        System.out.println("Exiting...");
        break;

    default:
        System.out.println("Invalid choice! Please enter a valid option.");
}

} while (choice != 5);

scanner.close();
}

}
