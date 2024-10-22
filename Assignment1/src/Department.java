import java.util.ArrayList;
import java.util.List;


public class Department {
	List<Student> stuList = new ArrayList<>();
	private int deptno;
	
	public Department(int deptno) {
		super();
		this.deptno = deptno;
	}
	public Department() {
		super();

		// TODO Auto-generated constructor stub
	}
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public boolean add(Student stu){
		return stuList.add(stu);
	}
	public List<Student> findAll(){
		return this.stuList;
	}
	
	/*@Override
	public String toString() {
		return "Department [stuList=" + stuList + ", deptno=" + deptno + "]";
	}*/
	public void display(){
		for(Student st:stuList){
			System.out.println(st.getStudentName()+" "+st.getMarks1()+" "+st.getMarks2()+" "+st.getMarks3());
		}
	}
	public void average(){
		float avg=0,total=0;
		for(Student st:stuList){
			total =  total +st.getMarks1()+ st.getMarks2()+st.getMarks3();
		}
		avg=total/stuList.size();
		System.out.println("Average:"+avg);
	}
}
