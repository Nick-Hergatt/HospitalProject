package supportStaff;
public class Janitor extends SupportStaff {
	
	boolean isSweeping;


	
	public Janitor(String firstName, String employeeNum, boolean hasBeenPayed, boolean isSweeping) {
		super(firstName, employeeNum, hasBeenPayed);
		this.isSweeping = isSweeping;
		makePayRate();
	}
	public boolean getSweeping() {
		
		
		return isSweeping;
	}
	@Override
	public int getPayRate() {
		return payRate;
	}
	@Override
	public void payOutSalary() {
		makePayRate();
		if(hasBeenPayed == false) {;
		System.out.println("Janitor " + firstName + " has been paid " + getPayRate());
		payEmployee();
		}
		else if(hasBeenPayed == true) {
		System.out.println("Janitor " + firstName + " had already been paid");
		}
		
	}
	@Override
	public void makePayRate() {
		payRate = 40000;
		
	}

}
