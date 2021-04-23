/**
 * 
 */
package org.howard.edu.assignment7;
 

/**
 * @author deroiseli
 *
 */
public class atlantaToll implements Toll {
	protected int truckCounter = 0;
	protected int receiptCount = 0;
	protected int total;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayData() {
		// TODO Auto-generated method stub
		System.out.println("\n *** Collecting Receipts ***");
		System.out.println("Totals since the last collection - Receipts: $" + receiptCount + 
				" Trucks: " + truckCounter + "\n");
	}


	
	@Override
	public int calculateToll(Truck type) {
		// TODO Auto-generated method stub
		int axles = type.axles;
		int weight = type.weight;
		int total = (5* axles) + ((weight/1000)*10);
		receiptCount = receiptCount + total;
		truckCounter ++;
		
		
		
		return total ;
	}

	@Override
	public void reset() {
		displayData();
		truckCounter = 0;
		receiptCount = 0;
		// TODO Auto-generated method stub
		
	}

	

}
