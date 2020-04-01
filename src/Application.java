import java.util.*;

/**
 * The Application class contains the main method
 * EVERY method in the package is tested here
 * 
 * @author Kaitlyn Reed
 * @version 4.12
 * AnimalSim Project
 * Spring 2020
 */
public class Application {

	public static void main(String[] args) {
		
		System.out.println("*********************************************");
		System.out.println("              Location Tests                 ");
		System.out.println("*********************************************");
		
		
		// TESTING WITH EMPTY-ARGUMENT CONSTRUCTOR
		Location here = new Location();
		System.out.println("The current Location 'here' is: " + Arrays.toString(here.getCoordinates()));
		here.update(3, 3);
		System.out.println("Now the current Location 'here' is: " + Arrays.toString(here.getCoordinates()));
		
		System.out.println("\nTesting toString(): " + here.toString());
		System.out.println("\n");
		
		// TESTING WITH PREFERRED CONSTRUCTOR
		Location there = new Location(2,4);
		System.out.println("The current Location 'there' is: " + Arrays.toString(there.getCoordinates()));
		there.update(5, 7);
		System.out.println("Now the current Location 'there' is: " + Arrays.toString(there.getCoordinates()));
		
		System.out.println("\nTesting toString(): " + there.toString());
		System.out.println("\n");
		
		//TESTING GETTERS AND SETTERS
		System.out.println("The current x-coordinate for Location 'there' is: " + there.getxCoord());
		there.setxCoord(6);
		System.out.println("Now the current x-coordinate for Location 'there' is: " + there.getxCoord());
		//System.out.println("\nTESTING -1 TO MAKE SURE THE InvalidCoordinateException WORKS FOR setxCoord()");
		//there.setxCoord(-1);
		
		System.out.println();
		
		System.out.println("The current y-coordinate for Location 'there' is: " + there.getyCoord());
		there.setyCoord(8);
		System.out.println("Now the current y-coordinate for Location 'there' is: " + there.getyCoord());
		//System.out.println("\nTESTING -1 TO MAKE SURE THE InvalidCoordinateException WORKS FOR setyCoord()");
		//there.setyCoord(-1);
		System.out.println("\n");
		
		
		System.out.println("*********************************************");
		System.out.println("               Animal Tests                  ");
		System.out.println("*********************************************");
		
		
		// This can't be done because Animal is an abstract class
		//Animal animal = new Animal();
		
		// TESTING EMPTY-ARGUMENT USING BROWN BEAR
		Animal animal1 = new BrownBear();
		System.out.println("Testing the toString() for empty-arg constructor: \n" + animal1.toString());
		System.out.println("\n");
		
		// TESTING PREFERRED CONSTRUCTOR
		Animal animal2 = new BrownBear(20, new Location(4,5), "Alaskan");
		System.out.println("Testing the toString() for preferred constructor: \n" + animal2.toString());
		System.out.println("\n");
		
		// OTHER METHODS
		System.out.println("It is " + animal2.eat() + " that animal2 is full.");
		System.out.println();
		System.out.println("It is " + animal2.sleep() + " that animal2 is rested.");
		System.out.println("\n");
		
		// TESTING GETTERS AND SETTERS
		System.out.println("The current simID of animal1 is: " + animal1.getSimID());
		animal1.setSimID(200);
		// The following would trigger the InvalidSimIDException
		// animal1.setSimID(-2)
		System.out.println("Now the current simID of animal1 is: " + animal1.getSimID());
		System.out.println();
		
		System.out.println("The current simID of animal1 is: " + animal1.getLocation());
		animal1.setLocation(there);
		System.out.println("Now the current simID of animal1 is: " + animal1.getLocation());
		System.out.println("\n");
		
		System.out.println("The current state of being full of animal1 is: " + animal1.isFull());
		animal1.setFull(true);
		System.out.println("Now the current state of being full of animal1 is: " + animal1.isFull());
		System.out.println();
		
		System.out.println("The current state of being rested of animal1 is: " + animal1.isRested());
		animal1.setRested(false);
		System.out.println("Now the current state of being rested of animal1 is: " + animal1.isRested());
		System.out.println("\n");
		
		
		System.out.println("*********************************************");
		System.out.println("              Goldfinch Tests                ");
		System.out.println("*********************************************");
		
		
		// TESTING EMPTY-ARGUMENT CONSTRUCTOR
		Goldfinch GF = new Goldfinch();
		System.out.println("Testing the toString() for empty-arg constructor: \n" + GF.toString());
		System.out.println("\n");
		
		// TESTING PREFERRED CONSTRUCTOR
		Goldfinch gf = new Goldfinch(10, new Location(3,8), 8.4);
		System.out.println("Testing the toString() for preferred constructor: \n" + gf.toString());
		System.out.println("\n");
		
		// OTHER METHODS
		System.out.println("TESTING WALK METHOD");
		gf.walk(1);
		System.out.println("\n");
		gf.walk(2);
		System.out.println("\n");
		gf.walk(3);
		System.out.println("\n");
		gf.walk(4);
		System.out.println("\n");
		
		System.out.println("TESTING FLY METHOD");
		gf.fly(here);
		System.out.println("\n");
		gf.fly(new Location(6,7));
		System.out.println("\n\n");
		
		// TESTING GETTERS AND SETTERS
		System.out.println("The current wingspan of Goldfinch 'gf' is: " + gf.getWingSpan());
		gf.setWingSpan(10);
		// The following would trigger the InvalidWingspanException
		// gf.setWingSpan(13);
		System.out.println("Now the current wingspan of Goldfinch 'gf' is: " + gf.getWingSpan());
		System.out.println("\n");
		
		
		System.out.println("*********************************************");
		System.out.println("              BrownBear Tests                ");
		System.out.println("*********************************************");
		
		
		// TESTING EMPTY-ARGUMENT CONSTRUCTOR
		BrownBear BB = new BrownBear();
		System.out.println("Testing the toString() for empty-arg constructor: \n" + BB.toString());
		System.out.println("\n");
		
		// TESTING THE PREFERRED CONSTRUCTOR
		BrownBear bb = new BrownBear(10, new Location(2,6), "Asiatic");
		System.out.println("Testing the toString() for empty-arg constructor: \n" + bb.toString());
		System.out.println("\n");
		
		// OTHER METHODS
		System.out.println("TESTING WALK METHOD");
		bb.walk(1);
		System.out.println("\n");
		bb.walk(2);
		System.out.println("\n");
		bb.walk(3);
		System.out.println("\n");
		bb.walk(4);
		System.out.println("\n");
		
		System.out.println("TESTING SWIM METHOD");
		bb.swim(1);
		System.out.println("\n");
		bb.swim(2);
		System.out.println("\n");
		bb.swim(3);
		System.out.println("\n");
		bb.swim(4);
		System.out.println("\n\n");
		
		// TESTING GETTERS AND SETTERS
		System.out.println("The current sub-species of BrownBear 'bb' is: " + bb.getSubSpecies());
		bb.setSubSpecies("Siberian");
		// The following would trigger the InvalidSubspeciesException
		// bb.setSubSpecies("siberian");
		System.out.println("Now the current sub-species of BrownBear 'bb' is: " + bb.getSubSpecies());
		System.out.println("\n");
		
	} // end main

} // end Application
