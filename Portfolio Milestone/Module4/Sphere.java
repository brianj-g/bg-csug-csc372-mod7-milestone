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
 * Sphere class
 */
public class Sphere extends Shape {
	private double radius;
	
	/**
	 * Constructor for the Sphere class
	 * @param r the radius of the sphere
	 */
	public Sphere(double r) {
		if (r > 0) {
			radius = r;	
		} else {
			throw new IllegalArgumentException("Radius must be positive");
		}
	}

	/**
	 * 
	 * @return the surface area of the sphere
	 */
	public double surface_area() {
		double surfaceArea = 4.0 * Math.PI * Math.pow(radius, 2.0);
		
		return surfaceArea;
	}
	
	/**
	 * @return the volume of the sphere;
	 */
	public double volume() {
		double vol = (4.0 / 3.0) * (Math.PI * Math.pow(radius, 3.0));
		
		return vol;
	}
	
	/**
	 * 
	 * @return the radius of the sphere
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * 
	 * @param radius sets the radius of the sphere
	 */
	public void setRadius(double r) {
		radius = r;
	}
	
	/**
	 * Overrides the toString() method of the Object class to return a custom string for the object.
	 * @return a custom string containing the surface area and volume
	 */
	@Override
	public String toString() {
		return String.format("Sphere surface area: %.3f | Sphere volume: %.3f", surface_area(), volume());
	}
}
