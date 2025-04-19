package generics;

public class Point2D {

    private final double x;
    private final double y;

    public Point2D(double x, double y) {
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
        if (!(other instanceof Point2D)) {
            return false;
        } else {
            Point2D otherPoint = (Point2D) other;
            return otherPoint.getX() == this.getX() &&
                    otherPoint.getY() == this.getY();
        }

    }

}

