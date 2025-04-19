package edges;

import java.util.Objects;

public class Edge {

    private final Point start;
    private final Point end;

    /**
     *
     * @param start
     * @param end
     * @throws IllegalArgumentException if start and end are equal
     */
    public Edge(Point start, Point end) throws IllegalArgumentException { //throws EqualPointException {
//        if (start == null || end == null) {
//            throw new NullPointerException("Eingabe: null");
//        }

//        if (start.equals(end))
//            throw new EqualPointException(start);

        if (start.equals(end))
            throw new IllegalArgumentException("Start und Ende sind gleich");

        this.start = Objects.requireNonNull(start);
        this.end = Objects.requireNonNull(end);
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
