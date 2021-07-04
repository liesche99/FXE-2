package model;

public class MEllipse extends MShape {

	private double radiusX;
	private double radiusY;

	public MEllipse(double x, double y, double radiusX, double radiusY) {
		super(x, y);
		this.radiusX = radiusX;
		this.radiusY = radiusY;
	}

	public double getRadiusX() {
		return radiusX;
	}

	public double getRadiusY() {
		return radiusY;
	}

	public double area() {
		return (Math.PI * this.radiusX * this.radiusY);
	}

	public double circumference() {
		return (2 * Math.PI * Math.sqrt((Math.pow(this.radiusX, 2) + Math.pow(this.radiusY, 2)) / 2));
	}

	public String toString() {
		return "Ellipse with: " + origin() + "radiusX: " + this.radiusX + "radiusY: " + this.radiusY;
	}
}
