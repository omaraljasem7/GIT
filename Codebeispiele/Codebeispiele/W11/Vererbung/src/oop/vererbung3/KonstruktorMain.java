package oop.vererbung3;

public class KonstruktorMain {
    public static void main(String[] args) {
        Edge[] edgesPoly = new Edge[]{new Edge(0.0, 1.0, 2.0, 3.0), new Edge(2.0, 3.0, 0.0, 1.0)};
        Edge[] edgesTraj = new Edge[]{new Edge(0.0, 1.0, 2.0, 3.0), new Edge(2.0, 3.0, 4.0, 5.0)};

        Edge[] noPolygon = new Edge[]{new Edge(0.0, 1.0, 2.0, 3.0), new Edge(2.0, 3.0, 4.0, 5.0)};
        Edge[] noTrajectory = new Edge[]{new Edge(0.0, 1.0, 2.0, 3.0), new Edge(7.0, 3.0, 4.0, 5.0)};

        System.out.println("new Trajectory(edgesTraj);");
        new Trajectory(edgesTraj);
        System.out.println();

        System.out.println("new Trajectory(noTrajectory);");
        new Trajectory(noTrajectory);
        System.out.println();

        System.out.println("new Polygon(noTrajectory);");
        new Polygon(noTrajectory);
        System.out.println();

        System.out.println("new Trajectory(noPolygon);");
        new Trajectory(noPolygon);
        System.out.println();

        System.out.println("new Polygon(noPolygon);");
        new Polygon(noPolygon);
        System.out.println();

        System.out.println("new Polygon(edgesPoly);");
        new Polygon(edgesPoly);
        System.out.println();
    }
}
