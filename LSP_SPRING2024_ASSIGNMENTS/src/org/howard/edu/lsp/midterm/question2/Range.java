package org.howard.edu.lsp.midterm.question2;

/**
 * Interface representing a range of integers.
 */
public interface Range {
	/**
	Determines whether the provided value falls within the range.
	@param value the value to be evaluated
	@return true if the value is within the range, otherwise false
	*/
	
	boolean contains(int value);
	/**
	Determines if there is any overlap between this range and another range.
	@param other the other range to compare for overlap
	@return true if there is an overlap, otherwise false
	*/
    boolean overlaps(Range other);

    /**
     * that gets lower bound of the range.
     * @return the lower bound of the range
     */
    int getLowerBound();

    /**
     * that gets the upper bound of the range.
     * @return the upper bound of the range
     */
    int getUpperBound();

    /**
     * output the number of integer
     * @return the num of integer
     */
    int size();
}