package org.howard.edu.lsp.exam.question40;

public class Tiger extends Flying implements Animals{

	private String name;
	private int fly;
	public Tiger(int fly, String name) { 
		this.fly = fly;
		this.name = name;
			
	}
	
	
	
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("The tiger speaks.");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("The tiger moves forward");
		
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
