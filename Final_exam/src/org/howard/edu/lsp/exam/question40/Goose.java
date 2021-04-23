package org.howard.edu.lsp.exam.question40;

public class Goose extends Flying implements Animals {
	
	
	private String name;
	private int fly;
	public Goose(int fly, String name) { 
		this.fly = fly;
		this.name = name;
			
	}
	

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void name() {
		System.out.println(name);
	}
		// TODO Auto-generated method stub
		
	
	boolean ifFlying( boolean isFlying, int fly) {
			if (fly % 2 == 0) {
			return isFlying;}
			return notFlying;
		};
		
		
	
	

}
