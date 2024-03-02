package org.howard.edu.lsp.assignment4;


import org.howard.edu.lsp.assignment4.IntegerSet.IntegerSetException;

public class Driver {
    public static void main(String[] args) throws IntegerSetException {
    	// Create IntegerSets for testing
        IntegerSet set1 = new IntegerSet();
        

        // Add elements to set1 and set2
        set1.add(1);
        set1.add(2);
        set1.add(3);
       
       IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Print initial state of sets
        System.out.println("Initial state of set1: " + set1.toString());
        System.out.println("Initial state of set2: " + set2.toString());

        // Test various methods
        System.out.println("Length of set1: " + set1.length());
        System.out.println("Is set1 empty? " + set1.isEmpty());
        System.out.println("Does set1 contain 2? " + set1.contains(2));
        System.out.println("Smallest value in set1: " + set1.smallest());
        System.out.println("Largest value in set1: " + set1.largest());
        
        
        //set1.union(set2);
       // System.out.println("Union of set1 and set2: " + set1.toString());

        
       // set1.intersect(set2);
       // System.out.println("Intersection of set1 and set2: " + set1.toString());
        
        set1.intersect(set2);
        if (!set1.isEmpty()) {
        	System.out.println("Intersection of set1 and set2: " + set1.toString());
        } else {
        	System.out.println("Intersection is empty");
        }
        // Restore set1 to it's original state
      //  set1.restoreOriginalSet();
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);
         
        set2.clear();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        
        set1.union(set2);
        if (!set1.isEmpty()) {
        	System.out.println("Union of set1 and set2: " + set1.toString());
        } else {
        	System.out.println("Union has no change");
        }
           
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);
         
        set2.clear();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        
        set1.diff(set2);
        System.out.println("Difference of set1 and set2: " + set1.toString());

        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);
         
        set2.clear();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        
        set1.complement(set2);
        System.out.println("Complement of set1: " + set1.toString());

        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);
         
        set2.clear();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        
        // Test clear method
        set1.clear();
        System.out.println("After clearing set1: " + set1.toString());
}
}