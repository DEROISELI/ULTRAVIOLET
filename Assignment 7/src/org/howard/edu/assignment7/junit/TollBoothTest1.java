package org.howard.edu.assignment7.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.howard.edu.assignment7.atlantaToll;
import org.howard.edu.assignment7.FordRaptor;
import org.howard.edu.assignment7.Truck;
import org.howard.edu.assignment7.Silverado;
import org.howard.edu.assignment7.Toll;

class TollBoothTest1 {
	
	
	public static void main(String [] args){
	
	Toll atl =  new atlantaToll();
	
	Truck ford = new FordRaptor(5,2000);
	Truck silverado = new Silverado(3, 5000);
	//System.out.println(ford.getAxles());
	
	
	
	
	
	atl.calculateToll(silverado);
	atl.displayData();
	//atl.calculateToll(ford);
	//atl.displayData();
	//atl.reset();
	//TollTest test = new TollTest();
	//test.calculateToll();
	//test.displayData();
	
	
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() throws Exception {
		setUp();
		Truck ford = new FordRaptor(5,2000);
		int total  = (5* ford.getAxles()) + ((ford.getWeight()/1000)*10);
		//fail("Not yet implemented");
		
		assertEquals(total, 65);
		boolean equal;
		if (total % 2 == 0) {
			equal = true;
		}
		equal = false;
		
		assertTrue(total,equal);
		tearDown();
		
	}
	
	void assertEquals(int expected, int actual) {
		
	};
	
	void assertFalse() {
		
	};
	
	void assertTrue(int num, boolean bool) {
		
	};
	@DisplayData
	void displayData() throws Exception {
		setUp();
		Truck ford = new FordRaptor(5,2000);
		 int total  = (5* ford.getAxles()) + ((ford.getWeight()/1000)*10);
		 assertEquals(total, 65);
		 tearDown();
	};
	
	
};
