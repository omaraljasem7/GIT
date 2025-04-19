package oop.rechte.main;

import oop.rechte.geometrie.Edge;
import oop.rechte.geometrie.EdgeSet;
import oop.rechte.geometrie.Polygon;
import oop.rechte.geometrie.Trajectory;

public class Main3 {

    public static void main(String[] args) {
        Polygon p = new Polygon(
                new Edge[]{new Edge(3, 4, 5, 11),
                        new Edge(5, 11, 12, 8),
                        new Edge(12, 8, 9, 5),
                        new Edge(9, 5, 5, 6),
                        new Edge(5, 6, 3, 4)});

        EdgeSet es = new EdgeSet(
                new Edge[]{new Edge(3, 4, 5, 11),
                        new Edge(5, 11, 12, 8),
                        new Edge(12, 8, 9, 5),
                        new Edge(9, 5, 5, 6)});

        System.out.println(p.length());

//        p.edges = null;

        System.out.println(p.length());

//        new Square()
    }

}
