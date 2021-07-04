package model;

public class MSquare extends MShape{
	
	private double xDelta;

	
	  public MSquare(double xOrigin, double yOrigin, double xDelta) {
	        super(xOrigin, yOrigin);
	        this.xDelta = xDelta;
	    }
	  
	  public double getXDelta() {
	        return xDelta;
	    }
	  
	  public double area() {
	        return (2*this.xDelta)*(2*this.xDelta);
	    }
	  
	  public double circumference() {
	        return (8*this.xDelta);
	    }
	  
	  public String toString() {
	        return "Square with: " + origin() +
	                ", xDelta: " + this.xDelta;
	    }
}
