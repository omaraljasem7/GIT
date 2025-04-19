package oop.vererbung3;

public class Trajectory extends EdgeSet {

    public Trajectory(Edge[] edges) {
        super(edges);

        System.out.println(super.size);
        boolean connected = true;
        for (int i = 0; i < edges.length - 1; i++) {
            connected &= edges[i].getEnd().equals(edges[i + 1].getStart());
        }

        if (!connected) {
            System.out.println("Fehler: die Kanten sind nicht verbunden.");
        }
    }

    public Point[] intersection() {
        Point[] points = new Point[edges.length];

        int startIndex;
        if (edges[0].getStart().equals(edges[size - 1].getEnd())) {
            // trajectory is closed, so include start point for first edge
            startIndex = 0;
        } else {
            // tragectory is not closed, ignore start point of first edge
            startIndex = 1;
        }
        for (int i = startIndex; i < size; i++) {
            points[i] = edges[i].getStart();
        }
        return points;
    }

}
