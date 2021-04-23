package org.howard.edu.assignment7.tollbooth;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TollBoothTest {
	
	static Toll booth = new AtlantaTollBooth(0,0);
	static Chevorlet silverado = new Chevorlet(5,2500);
	static Dodge durango = new Dodge(3,3000);
	
	

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	
	assertEquals(silverado.getWeight(2500), 2500);
	}
	private void assertEquals(int expected, int actal ) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String [] args) {
		booth.calculateToll(durango);
		booth.displayData();
	}

}
