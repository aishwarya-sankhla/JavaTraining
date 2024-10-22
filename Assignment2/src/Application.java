import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Doctor id:");
		int id = sc.nextInt();
		System.out.println("Special:");
		String s =sc.next();
		
		Patient p1 = new Patient(101,"Sam");
		Patient p2 = new Patient(102,"John");
		Patient p3 = new Patient(103,"Jack");
		Patient p4 = new Patient(104,"Jake");
		Patient p5 = new Patient(105,"Cole");
		
		Doctor d1 = new Doctor(11,"Dr. Clive","random");
		Doctor d2 = new Doctor(12,"Dr. Kit","ortho");
		Doctor d3 = new Doctor(12,"Dr.","ortho");
		
		Hospital h = new Hospital();
		
		d1.addPatient(p1);
		d2.addPatient(p2);
		d2.addPatient(p3);
		d2.addPatient(p4);
		
		h.add(d1);
		h.add(d2);
		h.add(d3);
		
		List<Doctor> doc = h.findAll();
		
		h.fixAppointment(d1, d1.patientset);
		h.fixAppointment(d2, d2.patientset);
		h.fixAppointment(d1, p5);
		
		for(Doctor doctor:doc){
			if(doctor.getDoctorId() == id){
				h.display(doctor);
				break;
			}
		}

		for(Doctor doctor:doc){
			if(doctor.getSpecial().equals(s)){
				System.out.println(doctor.getDoctorName());
			}
		}
		sc.close();
	}

}
