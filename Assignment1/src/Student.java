
public class Student {
	private String studentName;
	private int marks1;
	private int marks2;
	private int marks3;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, int marks1, int marks2, int marks3) {
		super();
		this.studentName = studentName;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMarks1() {
		return marks1;
	}
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	public int getMarks3() {
		return marks3;
	}
	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	/*@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", marks1=" + marks1 + ", marks2=" + marks2 + ", marks3="
				+ marks3 + "]";
	}*/
	
	
}
