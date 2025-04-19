package oop.vererbung3;

public class PolymorphieMain {

    public static void main(String[] args) {
        Edge[] edgesPoly = new Edge[]{new Edge(0.0, 1.0, 2.0, 3.0), new Edge(2.0, 3.0, 0.0, 1.0)};
        Edge[] edgesTraj = new Edge[]{new Edge(0.0, 1.0, 2.0, 3.0), new Edge(2.0, 3.0, 4.0, 5.0)};
        Polygon poly;    // kann auf Polygon-Objekte verweisen
        Trajectory traj;    // kann auf Polygon- und Kantenzug-Objekte verweisen
        poly = new Polygon(new Edge[]{new Edge(0.0, 1.0, 2.0, 3.0)});
        traj = poly;            // Polygon ist auch ein Kantenzug
        Object o = traj;                // Kantenzug ist ein Objekt
        Trajectory[] geoArr = {new Polygon(edgesPoly), new Trajectory(edgesTraj)};
        Point[] points = geoArr[0].intersection();
        points = geoArr[1].intersection();

        Trajectory traj1 = new Polygon(edgesPoly);       // lz1 verweist auf Objekt der Klasse Polygon
        Polygon poly1 = (Polygon) traj1;         // Konvertierung ist somit erlaubt.


        Trajectory traj2 = new Trajectory(edgesTraj);
        Polygon poly2= (Polygon) traj2;
        // Dies wird zwar ohne Fehlermeldung übersetzt, führt aber bei der
        // Programmausführung zu einem Fehler, der eine sogenannte Exception auslöst.

    }
}
