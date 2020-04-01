/**
 * InvalidSubspeciesException extends RuntimeException and is used in the BrownBear class
 * gets thrown if the subSpecies is invalid compared to possible sub-species
 * 
 * @author Kaitlyn Reed
 * @version 4.12
 * AnimalSim Project
 * Spring 2020
 */
public class InvalidSubspeciesException extends RuntimeException {

	private static final long serialVersionUID = 1L; // I don't actually know what this is for
	// Eclipse said I needed it

	/**
	* InvalidSubspeciesException takes a message input to display as an error
	 * 
	 * @param message: desired message to user
	 */
	public InvalidSubspeciesException(String message) {
		super(message);
	} // end exception
	
} // end InvalidSubspeciesException
