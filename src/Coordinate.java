import java.util.Random;

public class Coordinate {
	int x;
	int y;
	
	public Coordinate() {
		Random r = new Random(); 
		this.x = r.nextInt(128);;
		this.y = r.nextInt(128);;
	}
	public Coordinate(int xval, int yval) {
		this.x = xval;
		this.y = yval;
	}
	
	public String toString() {
		return("("+this.x+", "+this.y+")");
	}
}

