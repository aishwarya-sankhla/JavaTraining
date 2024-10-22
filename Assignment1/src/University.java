import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class University {
	
	List<Department> deptList;
	
	public University() {
		super();
		deptList = new ArrayList<>();
	}
	public boolean add(Department dept){
		return deptList.add(dept);
	}
	public List<Department> findAll(){
		return this.deptList;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the deptno:");
		int no = sc.nextInt();		
		
		Student s1 = new Student("John", 20, 21, 23);
		Student s2 = new Student("Smith", 24, 25, 26);
		Student s3 = new Student("Sam", 27, 28, 29);
		
		Department d1 = new Department(101);
		Department d2 = new Department(102);
		d1.add(s1);
		d2.add(s2);
		d2.add(s3);
		
		University uni = new University();
		uni.add(d1);
		uni.add(d2);
		
		List<Department> deptServ = uni.findAll();
		//System.out.println(deptServ);
		
		
		for(Department d:deptServ){
			if(d.getDeptno() == no){
				d.display();
				d.average();
				break;
			}
		}
		
		sc.close();
		
		
		
		//deptServ.forEach(System.out::println);
		
		
	}

}
