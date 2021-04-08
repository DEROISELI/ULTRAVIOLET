package org.howard.edu.lsp.assignment6;
import org.howard.edu.lsp.assignment6.IntegerSet;
import org.howard.edu.lsp.assignment6.IntegerSetException;
import org.howard.edu.lsp.assignment6.junit.after;
import org.howard.edu.lsp.assignment6.junit.Test;
//import static org.junit.jupiter.api.Assertions.*;


class IntegerSetTest {
	static IntegerSet newSet1 = new IntegerSet();
	static IntegerSet newSet2 = new IntegerSet();
	public static void main(String[] args){
	newSet1.add(52);
	newSet1.add(13);
	newSet1.add(2);
	newSet1.add(8);
	newSet1.add(6);
	newSet2.add(52);
	newSet2.add(13);
	newSet2.add(2);
	newSet2.add(8);
	newSet2.add(6);
	// aask professor if having the new set in the main is okay
	}

	private void assertFalse(int exInt, boolean contain) {
		// TODO Auto-generated method stub
		
	}
	private void assertEquals(int expected, int actual) {
		// TODO Auto-generated method stub
		
	}

	private void assertTrue(int exInt, boolean contain) {
		// TODO Auto-generated method stub
		
	}
	
	private void assertNull(int b) {
	// TODO Auto-generated method stub
		}
	//@Before (ask professor)
	public void setUp() throws Exception{}
    @after
	public void tearDown() throws Exception{}
	
	@Test
		public void testClear(){
		newSet1.clear();
		assertEquals(0,newSet1.length());
		
		//Adds more values and asserts a null method to make sure that the integer set is clear.
		newSet1.add(52);
		newSet1.add(13);
		newSet1.add(2);
		newSet1.add(8);
		newSet1.add(6);
		newSet1.clear();
		assertNull(newSet1.length());
		
		
		
	}
		
	
	
		public void testLength() {
			
			assertEquals(0, newSet1.length());
			newSet1.add(12);
			assertEquals(1, newSet1.length());
			
			
		}
		

		public void testEquals() {
			assertTrue(15, newSet1.equals(15));
		}

		public void testContains() {
			
		}
		public void testLargest() throws IntegerSetException{
			assertTrue(newSet1.largest(), newSet1.contains(0));
		}
		public void testSmallest() throws IntegerSetException {
			assertEquals(newSet1.smallest(), 0);
			newSet1.remove(0);
			newSet1.add(1);
			assertEquals(newSet1.smallest(), 1);
			
		}
		public void testAdd() {
			newSet1.add(99);
			assertTrue(99, newSet1.contains(99));
			
			
		}
		public void testRemove() {
			newSet1.remove(13);
			assertFalse(13,newSet1.contains(13));
			
		}
		
		public void testUnion() {}
		public void testIntersect() {}
		
		
		public void tesIsEmpty() {
			newSet1.clear();
			assertNull(newSet1.length());
			assertEquals(0,newSet1.length() );
		}
		
		public void testString() {
			System.out.println(newSet1);
			newSet1.add(7);
			System.out.println("Is this really working??");
			
			//ask professor	
			
		}
}

		

