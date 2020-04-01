/**
 * InvalidCoordinateException extends RuntimeException and is used in the Location class
 * gets thrown if the x and y coordinates are invalid
 * 
 * @author Kaitlyn Reed
 * @version 4.12
 * AnimalSim Project
 * Spring 2020
 */
public class InvalidCoordinateException extends RuntimeException {

	private static final long serialVersionUID = 1L; // I don't actually know what this is for
	// Eclipse said I needed it

	/**
	 * InvalidCoordinateException takes a message input to display as an error
	 * 
	 * @param message: desired message to user
	 */
	public InvalidCoordinateException(String message) {
		super(message);
	} // end exception
} // end InvalidCoordinateException
