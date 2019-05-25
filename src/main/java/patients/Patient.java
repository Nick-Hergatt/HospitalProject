package patients;

public class Patient {
	private String firstName;
	private int bloodLevel;
	private int healthLevel;

	public Patient(String firstName) {
		this.firstName = firstName;
		this.bloodLevel = 20;
		this.healthLevel = 10;
	}

	public String getPaitent() {
		return null;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getBloodLevel() {
		return bloodLevel;
	}

	public int getHealthLevel() {
		return healthLevel;
	}

	public void caredForByNurse() {
		this.healthLevel ++;	
	}
	public void caredForByDoctor() {
		this.healthLevel += 2;	
	}

	public void bloodDrawByNurse() {
		this.bloodLevel -= 1;
		
	}

	public void bloodDrawByDoctor() {
		this.bloodLevel -= 2;
		
	}

}
