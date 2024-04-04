package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;


/**
 * Set of Integers .
 * Different ways and methods for manipulating Integer sets
 */

public class IntegerSet {

    // Store the set elements in an ArrayList
    private List<Integer> set = new ArrayList<Integer>();
    private List<Integer> originalSet = new ArrayList<Integer>(); //store original elements
    
    //Method to restore the set to its original state
    public void restoreOriginalSet() {
    	set.clear(); //clear- the current set
    	set.addAll(originalSet); // Restore original elements to the set
    }

    /**
     * Default Constructor
     * Empty IntegerSet
     */
    public IntegerSet() {
    }

    /**
     * Constructor if you want to pass in already initialized
     *
     * @param set ArrayList of integers to initialize the set
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
        this.originalSet.addAll(set); // Initialize OrginalSet with the same elements
    }

    
    /**
     * Clears the internal representation of the set
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the length of the set
     *
     * @return The length of the set
     */
    public int length() {
        return set.size();
    }

    /**
     * Returns true if the 2 sets are equal, false otherwise.
     * Two sets are equal if they contain all of the same values in ANY order.
     *
     * @param o Object to compare with
     * @return True if the sets are equal, otherwise false
     */
    public boolean equals(Object o) {
        if (o instanceof IntegerSet) {
            IntegerSet otherSet = (IntegerSet) o;
            return this.set.containsAll(otherSet.set) && otherSet.set.containsAll(this.set);
        }
        return false;
    }

    /**
     * Returns true if the set contains the value, otherwise false
     *
     * @param value The value to check
     * @return True if the set contains the value, otherwise false
     */
    public boolean contains(int value) {
        return set.contains(value);
    }
    
    //Custom exception class for IntegerSet
    public static class IntegerSetException extends Exception {
    	private static final long serialVersionUID = 1L;
    	// Default constructor
    	public IntegerSetException() {
    		super();
    	}
    		
    		//Constructor with a custom message
    		public IntegerSetException(String message) {
    			super(message);
    		
    	}
    }
    

    /**
     * Returns the largest item in the set.
     * Throws an IntegerSetException if the set is empty.
     *
     * @return The largest item in the set
     * @throws IntegerSetException If the set is empty
     */
    public int largest() throws IntegerSetException {
        if (isEmpty())
            throw new IntegerSetException("Set is empty");
        int max = Integer.MIN_VALUE;
        for (int num : set) {
            if (num > max)
                max = num;
        }
        return max;
    }

    /**
     * Returns the smallest item in the set.
     * Throws an IntegerSetException if the set is empty.
     *
     * @return The smallest item in the set
     * @throws IntegerSetException If the set is empty
     */
    public int smallest() throws IntegerSetException {
        if (isEmpty())
            throw new IntegerSetException("Set is empty");
        int min = Integer.MAX_VALUE;
        for (int num : set) {
            if (num < min)
                min = num;
        }
        return min;
    }

    /**
     * Adds an item to the set or does nothing if it already exists
     *
     * @param item The item to add to the set
     */
    public void add(int item) {
        if (!contains(item))
            set.add(item);
    }

    /**
     * Removes an item from the set or does nothing if it does not exist
     *
     * @param item The item to remove from the set
     */
    public void remove(int item) {
        set.remove((Integer) item);
    }

    /**
     * Set union.
     * Adds all elements from intSetb to this set.
     *
     * @param intSetb The other IntegerSet
     */
    public void union(IntegerSet intSetb) {
        for (Integer num : intSetb.set) {
            if (!set.contains(num)) {
                set.add(num);
        }
    }
    }

    /**
     * Set intersection.
     * Retains only the elements in this set that are contained in the specified IntegerSet.
     *
     * @param intSetb The other IntegerSet
     */
    public void intersect(IntegerSet intSetb) {
    	//List<Integer> bSet = intSetb.getSet();
    	List<Integer> result = new ArrayList<>();
    	for (Integer i : set) {
    	//	System.out.println(i);
    	//	System.out.println(intSetb.set.contains(i));
    		if (intSetb.set.contains(i)) {
    			result.add(i);
    		}
    	}
    	set = result;
    	//System.out.println("Result");
		//System.out.println(result);
		
    	
     //  set.retainAll(intSetb.set);
    }

    /**
     * Set difference, i.e., s1 - s2
     * Removes from this set all of its elements that are contained in the specified IntegerSet.
     *
     * @param intSetb The other IntegerSet
     */
    public void diff(IntegerSet intSetb) {
    	//iterate over each number in the intSetb
    	for (Integer element : intSetb.set )
        set.remove(element);
    }

    /**
     * Set complement.
     * Removes all elements in intSetb from this set.
     *
     * @param intSetb The other IntegerSet
     */
    public void complement(IntegerSet intSetb) {
        List<Integer> complement = new ArrayList<>(intSetb.set);
        complement.removeAll(set);
        set = complement;
    }

    /**
     * Returns true if the set is empty, false otherwise
     *
     * @return True if the set is empty, false otherwise
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Return String representation of the set.
     *
     * @return String representation of the set
    */
    public String toString() {
    	if (set.isEmpty()) {
    		return "[]";
    	}
    	return set.toString();
    	}
    public List<Integer> getSet() {
    	return set;
    }
}
    
    