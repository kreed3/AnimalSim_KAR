import java.util.Arrays;

public class Goldfinch extends Animal implements Walkable, Flyable {
	
	private double wingSpan;
	
	InvalidWingspanException problem = new InvalidWingspanException("This wing span is invalid. Must be between 5.0 and 11.0.");
	
	public Goldfinch() {
		super();
		wingSpan = 9.0;
	}
	
	public Goldfinch(int simID, Location location, double wingSpan) {
		super(simID, location);
		setWingSpan(wingSpan);
	}

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
	}

	public void fly(Location location) {
		System.out.println("Your starting point is: ");
		System.out.print(Arrays.toString(this.location.getCoordinates()));
		
		int x = location.getxCoord();
		int y = location.getyCoord();
		
		this.location.update(x, y);
		
		System.out.println("\nThe Goldfinch flew to: ");
		System.out.print(Arrays.toString(this.location.getCoordinates()));
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nGoldfinch [wingSpan=" + wingSpan + ", simID=" + simID + ", location="
				+ Arrays.toString(location.getCoordinates()) + ", full=" + full + ", rested=" + rested + "]";
	}

	// GETTERS AND SETTERS
	public double getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(double wingSpan)  {
		if (wingSpan < 5.0 || wingSpan > 11.0)
			throw problem;
		else
		this.wingSpan = wingSpan;
	}

}
