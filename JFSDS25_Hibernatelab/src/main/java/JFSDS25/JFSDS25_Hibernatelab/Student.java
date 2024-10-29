package JFSDS25.JFSDS25_Hibernatelab;

public class Student {
	private int id;

    private String name;
    private String gender;
    private String department;
    private String program;
    private String dateOfBirth;
    private String contactNumber;
    private String graduationStatus;
    private double cgpa;
    private int noOfBacklogs;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getGraduationStatus() {
		return graduationStatus;
	}
	public void setGraduationStatus(String graduationStatus) {
		this.graduationStatus = graduationStatus;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public int getNoOfBacklogs() {
		return noOfBacklogs;
	}
	public void setNoOfBacklogs(int noOfBacklogs) {
		this.noOfBacklogs = noOfBacklogs;
	}
	public String toString() {
        return "Student [id=" + id + ", name=" + name + ", gender=" + gender + 
                ", department=" + department + ", program=" + program + 
                ", dateOfBirth=" + dateOfBirth + ", contactNumber=" + contactNumber + 
                ", graduationStatus=" + graduationStatus + ", cgpa=" + cgpa + 
                ", noOfBacklogs=" + noOfBacklogs + "]";
    }

}
