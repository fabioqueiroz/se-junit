package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class SeniorLecturerTests {

	@Test
	public void progLeadTest() {
		main.SeniorLecturer sl = new main.SeniorLecturer();
		
		sl.setProglead("PhD");
		assertNotNull(sl.getProglead());
		assertEquals(sl.getProglead(), "PhD");
		
		sl.setProglead("Master");
		assertNotEquals(sl.getProglead(), "PhD");
		
	}
	
	@Test
	public void staffIdtest() {
		
		main.SeniorLecturer sl = new main.SeniorLecturer();
		
		sl.setStaffId("01");
		assertNotNull(sl.getStaffId());
		assertEquals(sl.getStaffId(), "01");
		
		sl.setStaffId("02");
		assertNotEquals(sl.getStaffId(), "01");
		
	}
	
	@Test
	public void phoneExtTest() {
		
		main.SeniorLecturer sl = new main.SeniorLecturer();
		
		sl.setPhoneExt(001);
		assertNotNull(sl.getPhoneExt());
		assertEquals(sl.getPhoneExt(), 001);
		
		sl.setPhoneExt(002);
		assertNotEquals(sl.getPhoneExt(), 001);
	}

}
