package models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import medicalEmployee.Doctor;

import models.HospitalEmployee;

public class HospitalStaffListTest {

	HospitalStaffList underTest = new HospitalStaffList();
	
	@Test
	public void ShouldBeAbleToAddEmployeeToList() {
		underTest.addEmployeeToStaff(new Doctor("John", 0, "", false, ""));
		String expectedName = underTest.getFirstName("John");		
		assertEquals("John", expectedName);
	}
	@Test
	public void shouldBeAbleToRemoveEmployeeFromStaff() {
		underTest.addEmployeeToStaff(new Doctor("John", 0, "", false, ""));
		underTest.removeEmployeeFromList("John");
		int expectedSize = underTest.getStaffSize();
		assertEquals(0, expectedSize);
		
	}
	
	
	
}
