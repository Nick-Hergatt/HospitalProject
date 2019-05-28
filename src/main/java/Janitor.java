
public class Janitor extends SupportStaff {
	
	Boolean isSweeping;

	public Janitor(String employeeNum, String firstName, int payRate, boolean isSweeping) {
	this.isSweeping = isSweeping;
	
	}
	public boolean getSweeping() {
		
		
		return isSweeping;
	}

}
