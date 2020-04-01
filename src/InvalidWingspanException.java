/**
 * InvalidWingspanException extends RuntimeException and is used in the Goldfinch class
 * gets thrown if the wingSpan is invalid 
 * 
 * @author Kaitlyn Reed
 * @version 4.12
 * AnimalSim Project
 * Spring 2020
 */
public class InvalidWingspanException extends RuntimeException{
	
	private static final long serialVersionUID = 1L; // I don't actually know what this is for
	// Eclipse said I needed it

	/**
	 * InvalidWingspanException takes a message input to display as an error
	 * 
	 * @param message: desired message to user
	 */
	public InvalidWingspanException(String message) {
		super(message);
	} // end exception
} // end InvalidWingSpanException
