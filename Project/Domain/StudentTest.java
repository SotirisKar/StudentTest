package Domain;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class StudentTest {
	private Student George;
	@Before
	public void setUp() throws Exception {
		George = new Student("George", "Karampekris", 4414034);
	}
	@After
	public void tearDown() throws Exception{
		George = null;
	}
	@Test
	public void testEqualsObject() {
		Student t = new Student("Another","Student",4414034);
		assertEquals(George,t);
	}
	@Test
	public void testGetLname() {
		assertEquals("Karampekris", George.getLname());
	}
}
