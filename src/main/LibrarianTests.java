package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class LibrarianTests {

	@Test
	public void libraryIdTest() {
		
		main.Librarian librarian = new main.Librarian();
		
		librarian.setLibraryId(1);
		assertNotNull(librarian.getLibraryId());
		assertEquals(librarian.getLibraryId(), 1);
		
		librarian.setLibraryId(2);
		assertNotEquals(librarian.getLibraryId(), 1);
	}
	
	@Test
	public void phoneExtTest() {
		
		main.Librarian librarian = new main.Librarian();
		
		librarian.setPhoneExt("111");
		assertNotNull(librarian.getPhoneExt());
		assertEquals(librarian.getPhoneExt(), "111");
		
		librarian.setPhoneExt("222");
		assertNotEquals(librarian.getPhoneExt(), "111");
	}

}
