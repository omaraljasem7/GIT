package oop.rechte.geometrie;

public class Edge {

    private final Point start;
    private final Point end;

    public Edge(double x1, double y1, double x2, double y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public double length() {
        return Math.sqrt(Math.pow(start.getX() - end.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
    }

    public double getX1() {
        return start.getX();
    }

    public double getY1() {
        return start.getY();
    }

    public double getX2() {
        return end.getX();
    }

    public double getY2() {
        return end.getY();
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

}
