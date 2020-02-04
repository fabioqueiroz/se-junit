package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTests {

  
	@Test
	public void nameTest() {
		
		main.Student student = new main.Student();
		
		student.setName("Test Name");
		assertNotNull(student.getName());
		assertEquals(student.getName(), "Test Name");
		
		student.setName("John");
		assertNotEquals(student.getName(), "Test Name");

	}
	
	@Test
	public void emailTest() {
		
		main.Student student = new main.Student();
		
		student.setEmail("t@test.com");
		assertNotNull(student.getEmail());
		assertEquals(student.getEmail(), "t@test.com");
		
		student.setEmail("t2@test.com");
		assertNotEquals(student.getEmail(), "t@test.com");
	}
	
	@Test
	public void studentIdTest() {
		main.Student student = new main.Student();
		
		student.setStudentId(11);
		assertNotNull(student.getStudentId());
		assertEquals(student.getStudentId(), 11);
		
		student.setStudentId(22);
		assertNotEquals(student.getStudentId(), 11);
	}
	
	@Test
	public void userNameTest() {
		main.Student student = new main.Student();
		
		student.setUserName("test");
		assertNotNull(student.getUserName());
		assertEquals(student.getUserName(), "test");
		
		student.setUserName("test 2");
		assertNotEquals(student.getUserName(), "test");
	}

}
