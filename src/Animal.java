import java.util.*;

/**
 * The Animal class is composed of elements from the Location class
 * Animal is the super class of BrownBear and Goldfinch
 * 
 * @author Kaitlyn Reed
 * @version 4.12
 * AnimalSim Project
 * Spring 2020
 */
public abstract class Animal {
	
	protected int simID; // represents the ID of the animal
	protected Location location; // represents where the animal is
	protected boolean full; // represents whether the animal is full
	protected boolean rested; // represents whether animal is rested
	
	InvalidSimIDException problem = new InvalidSimIDException("This ID is invalid. The ID must be greater than zero.");
	// allows the program to catch an invalid simID 
	
	/**
	 * Empty-arg constructor initializes:
	 * simID = 0
	 * location = [0,0]
	 * full = false
	 * rested = true
	 */
	public Animal() {
		simID = 0;
		location = new Location(0,0);
		full = false;
		rested = true;
	} // end empty-arg constructor
	
	/**
	 * Preferred constructor initializes:
	 * full = false
	 * rested = true
	 * and other instance fields are initialized to their respective values using a "this." statement
	 * 
	 * @param simID: the ID of the animal
	 * @param location: where the animal is
	 */
	public Animal(int simID, Location location) {
		setSimID(simID);
		setLocation(location);
		full = false;
		rested = true;
				
	} // end preferred constructor
	
	/**
	 * eat determines whether the animal is full based on a random number
	 * 
	 * @return  full: a boolean value representative of whether the animal is full or not
	 */
	public boolean eat() {
		double random = Math.random();
		if (random < 0.5) {
			System.out.println("The random value is: " + random);
			full = false;
			return full;
		} else {
			System.out.println("The random value is: " + random);
			full = true;
			return full;
		}
		
	} // end eat
	
	/**
	 * sleep determines whether the animal is full based on a random number
	 * 
	 * @return  rested: a boolean value representative of whether the animal is rested or not
	 */
	public boolean sleep() {
		double random = Math.random();
		if (random < 0.5) {
			System.out.println("The random value is: " + random);
			rested = false;
			return rested;
		} else {
			System.out.println("The random value is: " + random);
			rested = true;
			return rested;
		}
	} // end sleep
	
	/**
	 * toString creates a string to represent the Animal
	 * 
	 * @return a string to show the animals attributes
	 */
@Override
	public String toString() {
		return "Animal [simID=" + simID + ", location=" + Arrays.toString(location.getCoordinates()) + ", full=" + full + ", rested=" + rested + "]";
	} // end toString


	// GETTERS AND SETTERS

	/**
	 * @return the current simID of the Animal
	 */
	public int getSimID() {
		return simID;
	} // end getSimID
	
	/**
	 * checks whether the simID is less than or equal to 0
	 * potentially throws InvalidSimIDException
	 * 
	 * @param simID: the desired ID of the Animal
	 */
	public void setSimID(int simID) {
		if (simID <= 0)
			throw problem;
		else
		this.simID = simID;
	} // setSimID
	
	/**
	 * @return the current location of the Animal
	 */
	public Location getLocation() {
		return location;
	} // end getLocation
	
	/**
	 * @param location: desired location of the Animal
	 */
	public void setLocation(Location location) {
		this.location = location;
	} // end setLocation
	
	/**
	 * @return the current state of fullness of the Animal (boolean) 
	 */
	public boolean isFull() {
		return full;
	} // end isFull
	
	/**
	 * @param full: desired boolean value for full
	 */
	public void setFull(boolean full) {
		this.full = full;
	} // end setFull
	
	/**
	 * @return the current state of how rested the Animal is (boolean)
	 */
	public boolean isRested() {
		return rested;
	} // end isRested
	
	/**
	 * @param rested: desired boolean value for rested
	 */
	public void setRested(boolean rested) {
		this.rested = rested;
	} // end setRested
	
} // end Animal
