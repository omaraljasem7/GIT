package oop.vererbung3;

public class Polygon extends Trajectory { //implements ClosedShape {

    public Polygon(Edge[] edges) {
        super(edges);
        if (!edges[edges.length - 1].getEnd().equals(edges[0].getStart())) {
            System.out.println("Fehler: der Kantenzug is nicht geschlossen.");
        }
    }
    //...
    public double area() {
        // "shoelace formula"
        // assuming that the edges are ordered clockwise or counter-clockwise
        // Initialze area
        double area = 0.0;

        // Calculate value of shoelace formula
        int j = edges.length;
        for (int i = 0; i < size; i++) {
            Edge e = edges[i];
            area += (e.getX1() + e.getX2()) * (e.getY1() - e.getY2());
        }

        // Return absolute value
        return Math.abs(area / 2.0);
    }

    public Point[] intersection() {
        Point[] points = new Point[edges.length];
        for (int i = 0; i < size; i++) {
            points[i] = edges[i].getStart();
        }
        return points;
    }

}
