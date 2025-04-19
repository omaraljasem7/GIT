package oop.vererbung1;


public class Polygon {
    private final Edge[] edges;

    public Polygon(Edge[] edges) {
        this.edges = edges;
    }

    public double length() {
        double sum = 0.0;
        for (Edge e : edges)
            sum += e.length();
        return sum;
    }

    public double area() {
        // "shoelace formula"
        // assuming that the edges are ordered clockwise or counter-clockwise
        // Initialze area
        double area = 0.0;

        // Calculate value of shoelace formula
        for (Edge e : edges) {
            area += (e.getX1() + e.getX2()) * (e.getY1() - e.getY2());
        }

        // Return absolute value
        return Math.abs(area / 2.0);
    }

}
