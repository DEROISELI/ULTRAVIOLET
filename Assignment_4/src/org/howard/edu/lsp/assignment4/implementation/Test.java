package org.howard.edu.lsp.assignment4.implementation;
import  org.howard.edu.lsp.assignment4.implementation.IntegerSet;
import  org.howard.edu.lsp.assignment4.implementation.IntegerSetException;


public class Test {
	public static void main(String [] args){
		IntegerSet array1 = new IntegerSet();
		IntegerSet array2 = new IntegerSet();
		IntegerSet array3 = new IntegerSet();
		
		
		
		//Adding to the list
		array1.add(0);
		array1.add(12);
		array1.add(3);
		array1.add(6);
		array1.add(5);
		array1.add(4);
		array1.add(1);
		//array 2
		array2.add(1);
		array2.add(3);
		array2.add(4);
		array2.add(9);
		array2.add(12);
		array2.add(11);
		array2.add(16);
		
		//array 3
		array3.add(10);
		array3.add(15);
		array3.add(3);
		array3.add(6);
		array3.add(7);
		array3.add(9);
		array3.add(20);
		//length method tests
		
		System.out.println("Length is "+ array1.length());
		System.out.println("Length is "+ array2.length());
		System.out.println("Length is "+ array3.length());
		
		//contain method tests
		System.out.println("If the array contains the value then true, else: FALSE! results are: "+ array1.contains(6));
		System.out.println("If the array contains the value then true, else: FALSE! results are: "+ array2.contains(7));
		System.out.println("If the array contains the value then true, else: FALSE! results are: "+ array3.contains(30));
	//add method tests	
		array1.add(32);
		array2.add(15);
		array3.add(6);
	//remove method tests
		array1.remove(0);
		array2.remove(3);
		array3.remove(7);
		
		
		
		//smallest method tests
		try {array1.largest();
		System.out.println("The largest number in the array is: "+array1.largest());}
		
		catch(IntegerSetException message) {System.out.println(message);}
		
		try {array2.largest();
		System.out.println("The largest number in the array is: "+array2.largest());}
		
		catch(IntegerSetException message) {System.out.println(message);}
		
		try {array3.largest();
		System.out.println("The largest number in the array is: "+array3.largest());}
		
		catch(IntegerSetException message) {System.out.println(message);}
		
		
		
		//smallest method tests
		try {array1.smallest();
		System.out.println("The largest number in the array is: "+array1.smallest());}
		
		catch(IntegerSetException message) {System.out.println(message);}
		
		try {array1.smallest();
		System.out.println("The largest number in the array is: "+array2.smallest());}
		
		catch(IntegerSetException message) {System.out.println(message);}
		
		try {array1.smallest();
		System.out.println("The largest number in the array is: "+array3.smallest());}
		
		catch(IntegerSetException message) {System.out.println(message);}
			
		}

}
