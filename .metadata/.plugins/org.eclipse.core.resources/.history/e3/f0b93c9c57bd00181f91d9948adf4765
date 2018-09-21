import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Hospital {
	private String hospitalName;
	List<Doctor> docList = new ArrayList<>();;
	
	HashMap<Doctor, TreeSet<Patient>> appointment = new HashMap<>();
	public Hospital() {
		super();
		
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	
	public Object fixAppointment(Doctor d,TreeSet<Patient> patientset ){
		return appointment.put(d,patientset);
	}
	
	public boolean fixAppointment(Doctor doc,Patient patient ){
		TreeSet<Patient> patientSet = appointment.get(doc);
				return patientSet.add(patient);
	}
	public void display(Doctor d){
		Iterator<Patient> itr=d.patientset.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next().getPatientName());
		}
	}
}
