package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	
	public void testCreateNewEmptyStack() {
		        
		Stack s1 = new Stack();
		int size = s1.getSize();
		
		assertEquals(0, size);
		assertTrue(s1.isEmpty());
	}
	
	public void testPushElmToTop(){
		Stack s1 = new Stack();
		s1.push(1);
		int size = s1.getSize();
		
		assertEquals(1, size);
		boolean empty = s1.isEmpty();
		assertFalse(empty);
		
	}
	
	public void testPushAndPop() {
		Stack s1 = new Stack();
	    
		s1.push(1);
		s1.push(2);
		s1.push(3);
		
		int popitem = s1.pop();
		
		
	}
	
	public void testIsFull() {
		Stack s1 = new Stack();
		s1.push(1);
		s1.push(2);
		
		assertEquals(2, s1.getSize());
		assertTrue(s1.isFull());
	}

}
