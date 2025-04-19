package oop.rechte.main;

import oop.rechte.geometrie.Edge;
import oop.rechte.geometrie.Polygon;

public class Square extends Polygon {

    public Square(Edge[] edges) {
        super(edges);
        if (edges.length != 4) {
            System.out.println("Fehler: Es werden genau 4 Kanten benötigt.");
        }
        if (!(edges[0].length() == edges[1].length() &&
                edges[0].length() == edges[2].length() &&
                edges[0].length() == edges[3].length())) {
            System.out.println("Feher: Es müssen alle Kanten gleich lang sein.");
        }
     }

    @Override
    public double area() {
        return Math.pow(edges[0].length(), 2);
    }
}
