package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class LecturerTests {

	@Test
	public void staffIdtest() {
		
		main.Lecturer lecturer = new main.Lecturer();
		
		lecturer.setStaffId("01");
		assertNotNull(lecturer.getStaffId());
		assertEquals(lecturer.getStaffId(), "01");
		
		lecturer.setStaffId("02");
		assertNotEquals(lecturer.getStaffId(), "01");
		
	}
	
	@Test
	public void phoneExtTest() {
		
		main.Lecturer lecturer = new main.Lecturer();
		
		lecturer.setPhoneExt(001);
		assertNotNull(lecturer.getPhoneExt());
		assertEquals(lecturer.getPhoneExt(), 001);
		
		lecturer.setPhoneExt(002);
		assertNotEquals(lecturer.getPhoneExt(), 001);
	}

}
