package edges;

public class Point {

    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean equals(Object other) {
        if (!(other instanceof Point)) {
            return false;
        } else {
            Point otherPoint = (Point) other;
            return otherPoint.getX() == this.getX() &&
                    otherPoint.getY() == this.getY();
        }
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}

