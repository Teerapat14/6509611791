package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
  
	public void testCreateNewEmptyStack () {
		Stack s1 = new Stack() ;
		int size = s1.getSize ();
		
		assertEquals(0, size);
		assertTrue(s1.isEmpty());
}
	public void testPushElmToTop() {
		Stack s1 = new Stack ();
		s1.push(1);
		int  size = s1.getSize();
		assertEquals(1, size);
		assertTrue(s1.isEmpty());
	}
	public void testPushDifferentTypeElement () {
		Stack s1 = new Stack ();
		try {
			s1.push((Integer) Integer.parseInt("String"));
			fail("Expected an Exception");
		}catch (NumberFormatException e) {
			assertEquals("For input string : \"string\"", e.getMessage());
			}
		}
	}
	
