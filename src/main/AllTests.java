package main;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ LecturerTests.class, LibrarianTests.class, SeniorLecturerTests.class, SeniorLibrarianTests.class,
		StudentTests.class })

public class AllTests {

}
