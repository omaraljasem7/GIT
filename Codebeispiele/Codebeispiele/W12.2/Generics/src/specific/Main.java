package specific;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(new Point2D (.2,.3));
        list.add(new Point2D (.3,.4));
        list.add(new Point2D (.4,.5));
        list.add(new Point2D (.5,.6));
        LinkedList list2 = new LinkedList();
//        list2.add(new String("..."));

        System.out.println("Liste ist leer " + list.isEmpty()); // toString sollte überschrieben sein.
        System.out.println("Gefunden: " + list.contains(new Point2D (.4,.5)));
        System.out.println("x des 1. Punkts:" + list.get(0).getX());
    }

}
