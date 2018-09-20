

public class Patient implements Comparable<Patient>{
	private int patientid;
	private String patientName;
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(int patientid, String patientName) {
		super();
		this.patientid = patientid;
		this.patientName = patientName;
	}
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	@Override
	public int compareTo(Patient o) {
		if(this.getPatientid()>o.getPatientid())
			return -1;
		if(this.getPatientid()<o.getPatientid())
			return 1;
		return 0;
	}
	
	
	
}
