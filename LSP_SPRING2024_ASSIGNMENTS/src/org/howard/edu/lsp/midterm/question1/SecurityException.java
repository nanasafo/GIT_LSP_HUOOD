package org.howard.edu.lsp.midterm.question1;

/**
 * This exception class represents security-related errors.
 */
public class SecurityException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Constructs a new security exception with the specified detail message.
     *
     * @param message The detail message (which is saved for later retrieval by the {@link #getMessage()} method).
     */
    public SecurityException(String message) {
        super(message);
    }
}
