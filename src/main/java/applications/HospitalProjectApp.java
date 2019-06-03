package applications;

import java.util.Scanner;

import medicalEmployee.Doctor;
import medicalEmployee.Nurse;
import models.HospitalEmployee;
import models.HospitalStaffList;
import models.PatientsRegister;
import patient.Patient;
import supportStaff.EmergencyResponderJenny;
import supportStaff.Janitor;
import supportStaff.Receptionist;

public class HospitalProjectApp {




public static void main(String[] args) {
    HospitalStaffList ourStaff = new HospitalStaffList();
    PatientsRegister ourPatients = new PatientsRegister();
    String userChoice;
    ourStaff.addEmployeeToStaff(new Doctor("Jane Goodall", "1101", false, "Pediatrician"));
    ourStaff.addEmployeeToStaff(new Nurse("Frank Reynolds", "1102", false, 5));
    ourStaff.addEmployeeToStaff(new Janitor("Bob", "1103", false, false));
    ourStaff.addEmployeeToStaff(new Receptionist("Tim Johnson", "1104", false, false));
    ourStaff.addEmployeeToStaff(new EmergencyResponderJenny("Jenny", "4361", false, false, false));
    ourPatients.addPatientToReg(new Patient("John Doe"));
    ourPatients.addPatientToReg(new Patient("Jane Doe"));
    ourPatients.addPatientToReg(new Patient("Josh Doe"));
    ourPatients.addPatientToReg(new Patient("Jerimiah Doe"));
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to little brusies Clinic \n");
    
    do {
    mainScreen();
    userChoice = input.nextLine();
    switch(userChoice) {
    case "1":
    	System.out.println("\nOur Doctors");
    	ourStaff.doctorStats();
    	System.out.println("\nOur Nurses");
    	ourStaff.nurseStats();
    	System.out.println("\nOur Janitors");
    	ourStaff.janitorStats();
    	System.out.println("\nOur Receptionists");
    	ourStaff.receptionistStats();
    	System.out.println("\nOur Emergency Responder");
    	ourStaff.emergencyResponderJennyStats();
    	System.out.println("");
    	System.out.println();
    	break;
    
    case "2":
    	System.out.println("Payroll Sheet");
    	ourStaff.payAllEmployees();
    	break;
    case "3":
    	System.out.println("Enter New Employee Name");
		String employeeToAddName = input.nextLine();
		if (ourStaff.isAValidNewEmployee(employeeToAddName)) {
			System.out.println("Enter 1 if new employee is a doctor");
			System.out.println("Enter 2 if new employee is a nurse");
			System.out.println("Enter 3 if new employee is a Janitor");
			System.out.println("Enter 4 if new employee is a Receptionist");
			String newEmployeeSelection = input.nextLine();
			if (newEmployeeSelection.equals("1")) {
				System.out.println("What is this doctors specialty");
				String newEmployeeSpecialty = input.nextLine();
				String newEmployeeNum = getNewEmployeeNum();
				ourStaff.addEmployeeToStaff(new Doctor(employeeToAddName, newEmployeeNum, false, newEmployeeSpecialty));
				System.out.println("Doctor " + employeeToAddName + " Has been added");
				
				
			} else if(newEmployeeSelection.equals("2")) {
				int assignedPatients = numOfPatients();
				String newEmployeeNum = getNewEmployeeNum();
				ourStaff.addEmployeeToStaff(new Nurse(employeeToAddName, newEmployeeNum, false, assignedPatients));
				System.out.println("Nurse " + employeeToAddName + " Has been added");
			} else if(newEmployeeSelection.equals("3")) {
				String newEmployeeNum = getNewEmployeeNum();
				ourStaff.addEmployeeToStaff(new Janitor(employeeToAddName, newEmployeeNum, false, false));
				System.out.println("Janitor " + employeeToAddName + " Has been added");
			} else if(newEmployeeSelection.equals("4")) {
				String newEmployeeNum = getNewEmployeeNum();
				ourStaff.addEmployeeToStaff(new Receptionist(employeeToAddName, newEmployeeNum, false, false));
				System.out.println("Receptionist " + employeeToAddName + " Has been added");
			} else {
				System.out.println("Please Enter A Valid Selection");
			}
			
		}else {
			System.out.println("Please enter a Valid Name");
		}
		break;
    case "4":
    	System.out.println("Please Enter the employee to remove");
    	String employeeToRemove = input.nextLine();
    	if (ourStaff.isAValidEmployee(employeeToRemove)) {
    		ourStaff.removeEmployeeFromList(employeeToRemove);
    	} else {
    		System.out.println("Please Enter a Valid Employee Name");
    	}
    	break;
    case "5":
    	System.out.println("\nOur Doctors");
    	ourStaff.doctorStats();
    	System.out.println("Please Select Which Doctor Will Care For The Patient\n");
    	String doctor = input.nextLine();
    	if(ourStaff.isAValidEmployee(doctor)) {
    		ourPatients.patientStats();
    		String patient = input.nextLine();
    		if(ourPatients.isAPatient(patient)) {
    			ourPatients.DcCare(patient);
    			ourPatients.DcDrawBlood(patient);
    			System.out.println("\nDoctor " + doctor + " Has cared for patient " + patient + "\n");
    		} else {
    			System.out.println("\nPlease Enter A Valid patient Name");
    		}
    	}else {
    		System.out.println("\nPlease Enter A Valid Doctor Name");
    	}
    	break;
    case "6":
    	System.out.println("\nOur Nurse");
    	ourStaff.doctorStats();
    	System.out.println("Please Select Which Nurse Will Care For The Patient\n");
    	String nurse = input.nextLine();
    	if(ourStaff.isAValidEmployee(nurse)) {
    		ourPatients.patientStats();
    		String patient = input.nextLine();
    		if(ourPatients.isAPatient(patient)) {
    			ourPatients.RnCare(patient);
    			ourPatients.RnDrawBlood(patient);
    			System.out.println("\nNurse " + nurse + " Has cared for patient " + patient + "\n");
    		} else {
    			System.out.println("\nPlease Enter A Valid patient Name");
    		}
    	}else {
    		System.out.println("\nPlease Enter A Valid Nurse Name");
    	}
    	break;
    case "7":
    	ourPatients.patientStats();
    	break;
    case "8":
    	System.out.println("Please Enter Employee Name");
    	String singleEmployee = input.nextLine();
    	if(ourStaff.isAValidEmployee(singleEmployee)) {
    		ourStaff.singleEmployeeStats(ourStaff.grabSingleEmployee(singleEmployee));
    		System.out.println();
    	}else {
    		System.out.println("No Such Employee Exists\n");
    	}
    	break;
    }
    
    }while(!userChoice.contentEquals("9"));
    System.out.println("Have A Nice Day!");
    
}
    private static void mainScreen() {
        System.out.println("- Enter 1 to Display Employees");
        System.out.println("- Enter 2 to Pay Employees");
        System.out.println("- Enter 3 to Hire A New Employee");
        System.out.println("- Enter 4 to Remove An Employee");
        System.out.println("- Enter 5 to Have A Doctor Care And Take A Blood Sample");
        System.out.println("- Enter 6 to Have A Doctor Care And Take A Blood Sample");
        System.out.println("- Enter 7 to Display Patient Stats");
        System.out.println("- Enter 8 to Search For Employee By Name");
        System.out.println("- Enter 9 to exit\n");
        
        
    }
    private static String getNewEmployeeNum() {
		String newEmployeeNum = Integer.toString((int)(Math.random() * ((9999 - 1000) + 1)) + 1000);
		return newEmployeeNum;
		
	}
    private static int numOfPatients() {
		return (int)(Math.random() * ((10 - 1) + 1)) + 1;
    	
    }
}