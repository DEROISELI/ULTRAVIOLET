package org.howard.edu.assignment7.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.howard.edu.assignment7.atlantaToll;
import org.howard.edu.assignment7.FordRaptor;
import org.howard.edu.assignment7.Truck;
import org.howard.edu.assignment7.Silverado;
import org.howard.edu.assignment7.Toll;




public class TollBoothTest {
public static void main(String [] args){
	
	Toll atl =  new atlantaToll();
	
	Truck ford = new FordRaptor(5,2000);
	Truck silverado = new Silverado(3, 5000);
	
	
	
	atl.calculateToll(silverado);
	atl.displayData();
	atl.calculateToll(ford);
	//atl.displayData();
	atl.reset();
	
	
	
	
	
	
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
	assertEquals(65,total){
};
	
};