package org.howard.edu.lsp.exam.question40;

public class Airplane extends Flying implements Animals{
	
	private int fly;
	private String name;

	public Airplane(int fly, String name) {
		this.fly = fly;
		this.name = name;
	}
	
	
	
	public void name() {
		System.out.println(name);
		
	}
	
	
	boolean ifFlying( boolean isFlying, int fly) {
		if (fly % 2 == 0) {
		return isFlying;}
		return notFlying;
	}



	@Override
	private void speak(){};//) 
		// TODO Auto-generated method stub
		
	


	@Override
	private void move(){};///) {
		// TODO Auto-generated method stub
		
	

}
