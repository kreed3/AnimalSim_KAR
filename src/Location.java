/**
 * Location class creates and keeps track of various locations
 * useful for the Animal class and its child classes BrownBear and Goldfinch
 * 
 * @author Kaitlyn Reed
 * @version 4.12
 * AnimalSim Project
 * Spring 2020
 */
public class Location {

	private int xCoord; // represents the x-coordinate of the location
	private int yCoord; // represents the y-coordinate of the location
	
	InvalidCoordinateException problem = new InvalidCoordinateException("That value is invalid for the coordinate. All values must be greater than or equal to zero.");
	// allows the program to catch an invalid subSpecies
	
	/**
	 * Empty-argument constructor initializes:
	 * xCoord = 0
	 * yCoord = 0
	 */
	public Location() {
		xCoord = 0;
		yCoord = 0;
	} // end empty-arg constructor
	
	/**
	 * preferred constructor initializes fields using the setters
	 * 
	 * @param xCoord: desired x-coordinated for the location
	 * @param yCoord: desired y-coordinated for the location
	 */
	public Location(int xCoord, int yCoord) {
		setxCoord(xCoord);
		setyCoord(yCoord);
	} // end preferred constructor

	/**
	 * update sets the x and y coordinates of an already existing location
	 * to new coordinates using the setters
	 * 
	 * @param xCoord: desired x-coordinated for the location
	 * @param yCoord: desired y-coordinated for the location
	 */
	public void update(int xCoord, int yCoord) {
		setxCoord(xCoord);
		setyCoord(yCoord);
	} // end update
	
	/**
	 * getCoordinates makes an integer array of the coordinates so they can later be printed
	 * 
	 * @return the coordinates of the location specified
	 */
	public int[] getCoordinates() {
		int[] coordinates = new int[2];
		coordinates[0] = xCoord;
		coordinates[1] = yCoord;
		return coordinates;
	} // end getCoordinates
	
	/**
	 * toString creates a string to represent the Location
	 * 
	 * @return a string to show the location's attributes
	 */
@Override
	public String toString() {
		return "Location [xCoord=" + xCoord + ", yCoord=" + yCoord + "]";
	} // end toString

	// GETTERS AND SETTERS

	/**
	 * @return the current x-coordinate
	 */
	public int getxCoord() {
		return xCoord;
	} // end getxCoord

	/**
	 * checks if the input is less than zero
	 * potentially throws InvalidCoordinateException
	 * 
	 * @param xCoord: desired x-coordinate
	 */
	public void setxCoord(int xCoord) {
		if (xCoord < 0)
			throw problem;
		else 
			this.xCoord = xCoord;
	} // end setxCoord

	/**
	 * @return the current y-coordinate
	 */
	public int getyCoord() {
		return yCoord;
	} // end getyCoord

	/**
	 * checks if the input is less than zero
	 * potentially throws InvalidCoordinateException
	 * 
	 * @param yCoord: desired y-coordinate
	 */
	public void setyCoord(int yCoord) {
		if (yCoord < 0)
			throw problem;
		else
			this.yCoord = yCoord;
	} // end setyCoord

} // end Location
