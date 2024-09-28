/*
 * 
 * Module 4 CTA Option 1: Creating an Abstract Class Shape
 * Brian Gunther
 * CSC372: Programming II
 * Colorado State University Global
 * Dr. Vanessa Cooper
 * September 8, 2024
 * 
 */

/**
 * Cylinder class
 */
public class Cylinder extends Shape {
	
	private double radius;
	private double height;
	
	/**
	 * Constructor for the Cylinder class
	 * @param r the radius of the cylinder
	 * @param h the height of the cylinder
	 */
	public Cylinder(double r, double h) {
		if((r > 0) && (h > 0)) {
			radius = r;
			height = h;
		} else {
			throw new IllegalArgumentException("Both radius and height must be positive");
		}
	}
	
	/**
	 * @return the surface area of the cylinder
	 */
	public double surface_area() {
		double surfaceArea = (2.0 * Math.PI * radius)*(radius + height);
		
		return surfaceArea;
	}
	
	/**
	 * @return the volume of the cylinder
	 */
	public double volume() {
		double vol = height * (Math.PI * Math.pow(radius, 2.0));
		
		return vol;
	}
	
	/**
	 * 
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * 
	 * @param r sets the radius
	 */
	public void setRadius(double r) {
		if (r > 0) {
			radius = r;	
		} else {
			throw new IllegalArgumentException("Radius must be positive");
		}
	}

	/**
	 * 
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * 
	 * @param h sets the height
	 */
	public void setHeight(double h) {
		if (h > 0) {
			height = h;	
		} else {
			throw new IllegalArgumentException("Height must be positive");
		}
	}

	/**
	 * Overrides the toString() method of the Object class to return a custom string for the object.
	 * @return a custom string containing the surface area and volume
	 */
	@Override
	public String toString() {
		return String.format("Cylinder surface area: %.3f | Cylinder volume: %.3f", surface_area(), volume());
	}
}
