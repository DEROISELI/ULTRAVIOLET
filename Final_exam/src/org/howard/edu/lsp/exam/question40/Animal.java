package org.howard.edu.lsp.exam.question40;

public class Animal extends Flying implements Animals {
	private String name;
	private int fly;
	public Animal(int fly, String name) { 
		this.fly = fly;
		this.name = name;
	}
	@Override
	public void speak() {
		
		System.out.println("The animals speak.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("The animals moves forward.");
		
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println(name);
		
	}
	
	
	boolean ifFlying( boolean isFlying, int fly ) {
		if (fly % 2 == 0) {
		return isFlying;}
		return notFlying;
	};
	
	

}
