package org.howard.edu.assignment7.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.howard.edu.assignment7.atlantaToll;
import org.junit.Test;
import org.howard.edu.assignment7.FordRaptor;
import org.howard.edu.assignment7.Truck;
import org.howard.edu.assignment7.Silverado;
import org.howard.edu.assignment7.Toll;


class TollTest {

	
	public static void main(String [] args){
		
		Toll atl =  new atlantaToll();
		
		Truck ford = new FordRaptor(5,2000);
		Truck silverado = new Silverado(3, 5000);
		//System.out.println(ford.getAxles());
		
		
		
		
		
		atl.calculateToll(silverado);
		atl.displayData();
		//atl.calculateToll(ford);
		//atl.displayData();
		atl.reset();
		TollTest test = new TollTest();
		test.calculateToll();
		
		


		
		
		
		
		
		
		
		
	}

	private void assertFalse(int exInt, boolean contain) {
		// TODO Auto-generated method stub
		
	}
	private void assertEquals(int expected, int actual) {
		// TODO Auto-generated method stub
		
	}

	private void assertTrue(int exInt, boolean contain) {}
		// TODO Auto-generated method stub

	
	 int calculateToll() {
		 Truck ford = new FordRaptor(5,2000);
		 int total  = (5* ford.getAxles()) + ((ford.getWeight()/1000)*10);
		 assertTrue(total, true);
		 if (total == 65) {
			 return total;
		 }
		 //System.out.println("Is this working??");
		 return 0;
	 }

	public void displayData() {
		// TODO Auto-generated method stub
		
	};
	 
	
	 
	 
}
