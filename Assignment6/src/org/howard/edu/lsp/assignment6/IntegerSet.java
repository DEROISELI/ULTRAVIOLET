package org.howard.edu.lsp.assignment6;
import org.howard.edu.lsp.assignment6.IntegerSetException;

import java.util.ArrayList;
import java.util.List;




public class IntegerSet  {
	// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> set = new ArrayList<Integer>();

	// Clears the internal representation of the set
	public void clear() {
		set.clear();
	};
	
	
	// Returns the length of the set
	public int length(){
		int length= set.size();
		return length;}
	
	/*
	              * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.
	*/
	public boolean equals(IntegerSet b)  {
		if (b == set) {
			return true;
		}
		
		return false;};
	
	
	// Returns true if the set contains the value, otherwise false
	public boolean contains(int value)  { 
		int length= set.size();
		for(int i =0; i<length; i++){
			if (set.get(i) == value){
				return true;
			};
		};
		return false;
	};
	
	
	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	public int largest() throws IntegerSetException {
		int max = 0;
		int length= set.size();
		if (set == null || set.isEmpty()) {
			throw new IntegerSetException("set is empty.");}
		for (int i = 1; i < length; i++) 
	         if (set.get(i)> max) 
	             max = set.get(i);
		return max;
	
	};
	
	
	// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	public int smallest() throws IntegerSetException{
		int min= 0;
		int length= set.size();
		if (set == null || set.isEmpty()) {
			throw new IntegerSetException("set is empty.");}
		for (int i = 1; i < length; i++) 
	         if (set.get(i)> min) 
	            min = set.get(i);
		return min;
	}
	
	
		// Adds an item to the set or does nothing it already there	
	 	public void add(int item) {
			int length= set.size();
		 	for(int i=0;i<length;i++)
		 		{if(set.get(i)==item)
		 			{}
		 	    };
		 	 set.add(item);
		 	System.out.println("You just added: "+ item);
		
		 	};  // adds item to s or does nothing if it is in set
	
		// Removes an item from the set or does nothing if not there
	public void remove(int item)  {
			int length= set.size();
			for(int i=0;i<length;i++){
		        if(set.get(i)==item){
		        	}
		    };
		    set.remove(item);
		    
		    System.out.println("You just removed: "+ item);
	
	}; 

 

// Set union
	public void union(IntegerSet intSetb){
		
	};
	
	// Set intersection
	public void intersect(IntegerSet intSetb) {}; 
	
	// Set difference, i.e., s1 –s2
	public void diff(IntegerSet intSetb) {}; // set difference, i.e. s1 - s2
	
	// Returns true if the set is empty, false otherwise
	boolean isEmpty() {
		return false;
	} 
	
	// Return String representation of your set
	public String toString() {
		return set.toString();
	 };	// return String representation of your set
}
