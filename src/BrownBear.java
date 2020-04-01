import java.util.Arrays;

/**
 * BrownBear class extends Animal and implements the Walkable and Swimmable interfaces
 * BrownBear specifies further variables: subSpecies
 * 
 * @author Kaitlyn Reed
 * @version 4.12
 * AnimalSim Project
 * Spring 2020
 */
public class BrownBear extends Animal implements Walkable, Swimmable{
	
	private String subSpecies; // represents the sub-species of the bear
	String[] allSubSpecies = {"Alaskan", "Asiatic", "European", "Grizzly", "Kodiak", "Siberian"}; // possible sub-species of bear
	
	InvalidSubspeciesException problem = new InvalidSubspeciesException("This not a valid sub-species.");
	// allows the program to catch an invalid subSpecies
	
	/**
	 * Empty-arg constructor calls the super constructor and initailizes
	 * subSpecies = "Alaskan"
	 */
	public BrownBear() {
		super();
		subSpecies = "Alaskan";
	} // end empty-arg constructor
	
	public BrownBear(int simID, Location location, String subSpecies) {
		super(simID, location);
		setSubSpecies(subSpecies);
	} // end preferred constructor

	public void walk(int direction) {
		System.out.println("Your starting point is: ");
		System.out.print(Arrays.toString(location.getCoordinates()));
		
		int xcoord = location.getxCoord();
		int ycoord = location.getyCoord();
		if (direction == 1) { // up
			location.setyCoord(ycoord + 3);
			System.out.println("\nThe " + subSpecies + " bear walked north three units.");
		} else if (direction == 2) { // right
			location.setxCoord(xcoord + 3);
			System.out.println("\nThe " + subSpecies + " bear walked east three units.");
		} else if (direction == 3) { // down
			location.setyCoord(ycoord - 3);
			System.out.println("\nThe " + subSpecies + " bear walked south three units.");
		} else { // left
			location.setxCoord(xcoord - 3);
			System.out.println("\nThe " + subSpecies + " bear walked west three units.");
		}
		System.out.println("The bear is now here: ");
		System.out.print(Arrays.toString(location.getCoordinates()));
	} // end walk
	
	public void swim(int direction) {
		System.out.println("Your starting point is: ");
		System.out.print(Arrays.toString(location.getCoordinates()));
		
		int xcoord = location.getxCoord();
		int ycoord = location.getyCoord();
		if (direction == 1) { // up
			location.setyCoord(ycoord + 2);
			System.out.println("\nThe " + subSpecies + " bear swam north two units.");
		} else if (direction == 2) { // right
			location.setxCoord(xcoord + 2);
			System.out.println("\nThe " + subSpecies + " bear swam east two units.");
		} else if (direction == 3) { // down
			location.setyCoord(ycoord - 2);
			System.out.println("\nThe " + subSpecies + " bear swam south two units.");
		} else { // left
			location.setxCoord(xcoord - 2);
			System.out.println("\nThe " + subSpecies + " bear swam west two units.");
		}
		System.out.println("The bear is now here: ");
		System.out.print(Arrays.toString(location.getCoordinates()));
	} // end swim
	
	
@ Override 
	public String toString() {
		return super.toString() + "\nBrownBear [subSpecies=" + subSpecies + ", simID=" + simID + ", location=" + Arrays.toString(location.getCoordinates()) 
		+ ", full=" + full + ", rested=" + rested + "]";
	}



	//GETTERS AND SETTERS
	public String getSubSpecies() {
		return subSpecies;
	}

	public void setSubSpecies(String subSpecies) {
		boolean found = false;

		for (String type : allSubSpecies) {
			
				if(subSpecies.equals(type)) {
					found = true;
					this.subSpecies = subSpecies;
				} 
					
			}
		if (found == false) {
			throw problem;
		}
	}
	
}
