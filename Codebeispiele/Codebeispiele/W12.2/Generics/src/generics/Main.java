package generics;

public class Main {

    public static void main(String[] args) {
        LinkedList<Point2D> list = new LinkedList<Point2D>();
        list.add(new Point2D(.2,.3));
        list.add(new Point2D(.3,.4));
        list.add(new Point2D(.4,.5));
        list.add(new Point2D(.5,.6));
        // list.add(new String("...")); // compile error

        LinkedList<String> listOfString = new LinkedList<String>();
        listOfString.add("Hello");
//        listOfString.add(new Point2D(0.1, 0.1)); // compile error

        Point2D result = list.get(0);

        System.out.println("Liste " + list); // toString sollte überschrieben sein.
        System.out.println("Gefunden: " + list.contains(new Point2D(.3,.3)));
        System.out.println("x des 1. Punkts:" + list.get(0).getX());
    }

}
