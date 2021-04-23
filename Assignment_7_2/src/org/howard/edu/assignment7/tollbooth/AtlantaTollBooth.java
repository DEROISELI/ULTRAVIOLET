package org.howard.edu.assignment7.tollbooth;
import org.howard.edu.assignment7.tollbooth.Truck;

public class AtlantaTollBooth  extends Truck  implements Toll {
	public AtlantaTollBooth(int axles, int weight) {
		super(axles, weight);
		// TODO Auto-generated constructor stub
	}

	public static  int receiptCount;
	public static  int truckCount;
	
	//public AtlantaTollBooth(int axles, int weight) {
		//super(axles, weight);
		// TODO Auto-generated constructor stub
	//}

	@Override
	public void displayData() {
		// TODO Auto-generated method stub
		
		System.out.println("*** Collecting receipts ***");
		System.out.println("Totals since last collection-"
				+ "Receipts"+receiptCount+" "+"Trucks "+truckCount);
		receiptCount = receiptCount + total;
		truckCount = truckCount++;
		
		
		
		
		
	}

	@Override
	public void location() {
		// TODO Auto-generated method stub
		System.out.println(location);
		
		
	}
	
	

	public int calculateToll(Truck type) {
		// TODO Auto-generated method stub
	
		int total = (axles*5)+((weight/500)*10);
		return total;
	}



	

	
	



}
