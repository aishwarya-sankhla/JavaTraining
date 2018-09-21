import java.util.TreeSet;

public class Doctor {
	private int doctorId;
	private String doctorName;
	TreeSet<Patient> patientset = new TreeSet<>();
	public Doctor(){
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(int doctorId, String doctorName) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public boolean addPatient(Patient p) {
		return patientset.add(p);
	}
	
}