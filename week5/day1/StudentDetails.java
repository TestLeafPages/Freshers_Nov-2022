package week5.day1;

public class StudentDetails {

	public void getStudentDetails(String name) {
		System.out.println("Student Name"+name);
	}
	public void getStudentDetails(int registerNumber) {
		System.out.println("Student no "+registerNumber);
	}
	public void getStudentDetails(int registerNumber,String name) {
		System.out.println(name+"Student no "+registerNumber);
	}
	public void getStudentDetails(long mobileNo) {
		System.out.println("Student no "+mobileNo);
	}
	public static void main(String[] args) {
		StudentDetails details=new StudentDetails();
		details.getStudentDetails("Anil");
		details.getStudentDetails(10223);
		details.getStudentDetails(10233,"Anil");
		details.getStudentDetails(998765626);
		
	}
}
