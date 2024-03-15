package org.howard.edu.lsp.midterm.question2;


/**
 * A class for testing the IntegerRange class.
 */
public class RangeTester {
    public static void main(String[] args) {
        // Test IntegerRange class
        IntegerRange range_a = new IntegerRange(20, 2000);
        IntegerRange range_b = new IntegerRange(6, 67);
        System.out.println("Range a contains 45: " + range_a.contains(7)); 
        System.out.println("Range b contains 234: " + range_b.contains(12)); 
        System.out.println("Range a overlaps with Range b: " + range_a.overlaps(range_b)); 
        System.out.println("Size of Range 1: " + range_a.size()); 
        System.out.println("Size of Range 2: " + range_b.size()); 
        IntegerRange range4 = new IntegerRange(50, 100);
        System.out.println("Range 1 equals Range 4: " + range_a.equals(range4)); // true
    }
}