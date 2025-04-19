package generics;

public class Pair<T1, T2> {

    private T1 left;
    private T2 right;

    public Pair(T1 a, T2 b) {
        left = a;
        right = b;
    }

    public static void main(String[] args) {
        Pair<String, Point2D> pair = new Pair<String, Point2D>("Hallo", new Point2D(0.1, 0.1)) ;
    }

}
