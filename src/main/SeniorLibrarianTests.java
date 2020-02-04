package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class SeniorLibrarianTests {

	@Test
	public void subjectLeadTest() {
		main.SeniorLibrarian senior = new main.SeniorLibrarian();
		
		senior.setSubjectLead("IT");
		assertNotNull(senior.getSubjectLead());
		assertEquals(senior.getSubjectLead(), "IT");
		
		senior.setSubjectLead("IT 2");
		assertNotEquals(senior.getSubjectLead(), "IT");
				
	}

}
