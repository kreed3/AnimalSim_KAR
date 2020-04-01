import java.util.Arrays;

/**
 * The Goldfinch class extends the Animal class and implements the Walkable and Flyable interfaces
 * Goldfinch specifies further variables: wingSpan
 * 
 * @author Kaitlyn Reed
 * @version 4.12
 * AnimalSim Project
 * Spring 2020
 */
public class Goldfinch extends Animal implements Walkable, Flyable {
	
	private double wingSpan; // represents the wing span of the bird
	
	InvalidWingspanException problem = new InvalidWingspanException("This wing span is invalid. Must be between 5.0 and 11.0.");
	// allows the program to catch an invalid wing spans
	
	/**
	 * Empty-arg constructor calls the super constructor and initializes:
	 * wingSpan = 9.0
	 */
	public Goldfinch() {
		super();
		wingSpan = 9.0;
	} // end empty-arg constructor
	
	/**
	 * preferred constructor calls the super constructor and initializes
	 * wingSpan using the setWingSpan method
	 * 
	 *@param simID: the ID of the bird
	 * @param location: where the bird is
	 * @param wingSpan: the wing span of the bird
	 */
	public Goldfinch(int simID, Location location, double wingSpan) {
		super(simID, location);
		setWingSpan(wingSpan);
	} // end preferred constructor

	/**
	 * walk moves the location of the bird in any cardinal direction 1 unit
	 * north = 1
	 * east = 2
	 * south = 3
	 * west = 4
	 */
	public void walk(int direction) {
		System.out.println("Your starting point is: ");
		System.out.print(Arrays.toString(location.getCoordinates()));
		
		int xcoord = location.getxCoord();
		int ycoord = location.getyCoord();
		if (direction == 1) { // up
			location.setyCoord(ycoord + 1);
			System.out.println("\nThe Goldfinch walked north one unit.");
		} else if (direction == 2) { // right
			location.setxCoord(xcoord + 1);
			System.out.println("\nThe Goldfinch walked east one unit.");
		} else if (direction == 3) { // down
			location.setyCoord(ycoord - 1);
			System.out.println("\nThe Goldfinch walked south one unit.");
		} else { // left
			location.setxCoord(xcoord - 1);
			System.out.println("\nThe Goldfinch walked west one unit.");
		}
		System.out.println("The Goldfinch is now here: ");
		System.out.print(Arrays.toString(location.getCoordinates()));
	} // end walk

	/**
	 * fly moves the location of the bird to whatever location is used as the input
	 */
	public void fly(Location location) {
		System.out.println("Your starting point is: ");
		System.out.print(Arrays.toString(this.location.getCoordinates()));
		
		int x = location.getxCoord();
		int y = location.getyCoord();
		
		this.location.update(x, y);
		
		System.out.println("\nThe Goldfinch flew to: ");
		System.out.print(Arrays.toString(this.location.getCoordinates()));
	} // end fly
	
	/**
	 * toString creates a string to represent the Goldfinch
	 * calls the super.toString to include the attributes from the Animal class
	 * 
	 * @return a string to show the birds attributes
	 */
	@Override
	public String toString() {
		return super.toString() + "\nGoldfinch [wingSpan=" + wingSpan + ", simID=" + simID + ", location="
				+ Arrays.toString(location.getCoordinates()) + ", full=" + full + ", rested=" + rested + "]";
	} // end toString

	// GETTERS AND SETTERS
	
	/**
	 * @return the current wing span of the bird
	 */
	public double getWingSpan() {
		return wingSpan;
	} // end getWingSpan

	/**
	 * checks if the wingSpan input is between 5.0 and 11.0
	 * potentially throws InvalidSubspeciesException
	 * 
	 * @param wingSpan: desired wing span for bird
	 */
	public void setWingSpan(double wingSpan)  {
		if (wingSpan < 5.0 || wingSpan > 11.0)
			throw problem;
		else
		this.wingSpan = wingSpan;
	} // end setWingSpan

} // end Goldfinch
