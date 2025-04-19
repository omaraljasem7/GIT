package oop.vererbung2;


public class OneClass {
    private final Edge[] edges;
    private final boolean istPolygon;

    public OneClass(Edge[] in, boolean poly) {
        this.edges = new Edge[in.length];
        istPolygon = poly;
        for (int i = 0; i < in.length; i++) {
            this.edges[i] = in[i];
        }
        if (poly) {
            // Hier müssen noch einige Überprüfungen erledigt werden.
        }
    }

    public double length() {
        double sum = 0.0;
        for (Edge e : edges)
            sum += e.length();
        return sum;
    }


    public double area() {
        // Wie kann man verhindern, dass die Methode für ein
        // Objekt aufgerufen wird bei dem istPolygon „false“ ist??

        if (!istPolygon) {
            return -1.0;
        }

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