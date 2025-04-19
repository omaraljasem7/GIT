package oop.abstr;

public class Circle extends GeoObjectWithExtent {
	private double radius;
	
	public Circle(double a, double b, double r) {
		super(a,b);
		radius = r;
	}
		@Override
	public Rectangle envelope() {
		return new Rectangle(x, y, radius, radius);
	}

	@Override	public double area() {
		return Math.PI*radius*radius;
	}
}
