package oop.abstr;

public abstract class GeoObjectWithExtent {
	protected double x, y;
	
	GeoObjectWithExtent(double a, double b) {
		x = a; y = b;
	}
	public abstract Rectangle envelope();
	
	public abstract double area();

	public double coverage() {
		return area() / envelope().area();
	}
}
