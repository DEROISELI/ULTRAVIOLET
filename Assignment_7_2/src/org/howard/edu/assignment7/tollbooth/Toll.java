package org.howard.edu.assignment7.tollbooth;

public interface Toll {
	void displayData();
	void location();
	final String location = "Atlanta";
	int calculateToll(Truck Type);

}
