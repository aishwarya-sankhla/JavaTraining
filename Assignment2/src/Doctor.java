import java.util.TreeSet;

public class Doctor {
	private int doctorId;
	private String doctorName;
	private String special;
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
	public Doctor(int doctorId, String doctorName, String special) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.special = special;
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
	public String getSpecial() {
		return special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}
	
	
}
