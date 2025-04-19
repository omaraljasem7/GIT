package general;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(new Point2D(.2,.3));
        list.add(new Point2D(.3,.4));
        list.add(new Point2D(.4,.5));
        list.add(new Point2D(.5,.6));
        list.add(new String("...")); // sollte nicht OK sein, aber Compiler findet das nicht als Fehler

        LinkedList listOfString = new LinkedList();
        listOfString.add(new String("..."));

        System.out.println("Liste " + list); // toString sollte überschrieben sein.
        System.out.println("Gefunden: " + list.contains(new Point2D(.3,.3)));
        //System.out.println("x des 1. Punkts:" + list.get(0).getX()); // darf nicht aufgerufen werden
        System.out.println("x des 1. Punkts:" + ((Point2D) list.get(0)).getX());
        System.out.println("x des 1. Punkts:" + ((Point2D) list.get(4)).getX());
    }

}
