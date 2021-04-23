/**
 * 
 */
package org.howard.edu.lsp.exam.question40;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author deroiseli
 *
 */

class AnimalsTest {
	
	
	public static void main(String [] args) {
		
		Animals geese = new Goose(2,"geese");
		Animals tigress = new Tiger(5,"tigress");
		Airplane plane = new Airplane(6,"plane");
		
		//plane.ifFlying(geese);
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	
	

}
