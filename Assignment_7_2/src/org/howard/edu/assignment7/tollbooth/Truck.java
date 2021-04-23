/**
 * 
 */
package org.howard.edu.assignment7.tollbooth;

/**
 * @author deroiseli
 *
 */
public abstract class Truck {
	
	protected int total;
	protected int axles;
	protected int weight;
	public Truck(int axles, int weight) {
		this.axles = axles;
		this.weight = weight;
	}
	
	
	public String name( String name) {
		// TODO Auto-generated method stub
		return name;
	}
	
	public int getAxles() {
		// TODO Auto-generated method stub
		return axles;
	}

	public int getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}
	
	
	

}
