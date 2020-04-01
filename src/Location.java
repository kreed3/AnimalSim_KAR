
public class Location {

	private int xCoord;
	private int yCoord;
	
	InvalidCoordinateException problem = new InvalidCoordinateException("That value is invalid for the coordinate. All values must be greater than or equal to zero.");
	
	public Location() {
		xCoord = 0;
		yCoord = 0;
	}
	
	public Location(int xCoord, int yCoord) {
		setxCoord(xCoord);
		setyCoord(yCoord);
	}

	public void update(int xCoord, int yCoord) {
		setxCoord(xCoord);
		setyCoord(yCoord);
	}
	
	public int[] getCoordinates() {
		int[] coordinates = new int[2];
		coordinates[0] = xCoord;
		coordinates[1] = yCoord;
		return coordinates;
	}
	
	
@Override
	public String toString() {
		return "Location [xCoord=" + xCoord + ", yCoord=" + yCoord + "]";
	}

	// GETTERS AND SETTERS
	public int getxCoord() {
		return xCoord;
	}

	public void setxCoord(int xCoord) {
		if (xCoord < 0)
			throw problem;
		else 
			this.xCoord = xCoord;
	}

	public int getyCoord() {
		return yCoord;
	}

	public void setyCoord(int yCoord) {
		if (yCoord < 0)
			throw problem;
		else
			this.yCoord = yCoord;
	}

}
