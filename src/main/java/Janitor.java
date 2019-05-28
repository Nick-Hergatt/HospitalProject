
public class Janitor extends SupportStaff {
	
	boolean isSweeping;


	
	public Janitor(String firstName, int payRate, String employeeNum, boolean hasBeenPayed, boolean isSweeping) {
		super(firstName, payRate, employeeNum, hasBeenPayed);
		this.isSweeping = isSweeping;
	}
	public boolean getSweeping() {
		
		
		return isSweeping;
	}
	@Override
	public int getPayRate() {
		return 40000;
	}

}
