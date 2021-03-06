/**
 * InvalidSimIDException extends RuntimeException and is used in the Animal class
 * gets thrown if the simID is invalid
 * 
 * @author Kaitlyn Reed
 * @version 4.12
 * AnimalSim Project
 * Spring 2020
 */
public class InvalidSimIDException extends RuntimeException{
	
	private static final long serialVersionUID = 1L; // I don't actually know what this is for
	// Eclipse said I needed it

	/**
	* InvalidSimIDException takes a message input to display as an error
	 * 
	 * @param message: desired message to user
	 */
	public InvalidSimIDException(String message) {
		super(message);
	} // end exception
} // end InvalidSimIDException
