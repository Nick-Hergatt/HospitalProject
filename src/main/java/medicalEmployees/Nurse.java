package medicalEmployees;

public class Nurse extends MedicalEmployees {
	 
		
		public Nurse(int patients) {
			this.patients = 0;
			this.payRate = "50000";
			this.firstName = "Jack";
			this.employeeNum = "1";
		}
		
		public int getPatients() {
			return patients;
		}
		
	}


