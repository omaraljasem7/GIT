package oop.vererbung1;

public class Main1 {

    public static void main(String[] args) {
        Polygon p = new Polygon(
                new Edge[]{new Edge(3, 4, 5, 11),
                        new Edge(5, 11, 12, 8),
                        new Edge(12, 8, 9, 5),
                        new Edge(9, 5, 5, 6),
                        new Edge(5, 6, 3, 4)});
        System.out.println(p.area());
        System.out.println(p.length());
        EdgeSet e;
//        e = p; // geht nicht

        e = new EdgeSet(new Edge[]{new Edge(3, 4, 5, 11),
                new Edge(5, 11, 12, 8),
                new Edge(12, 8, 9, 5),
                new Edge(9, 5, 5, 6),
                new Edge(5, 6, 3, 4)});
        System.out.println(e.length());
//        System.out.println(e.area());
        //      EdgeSet e2 = p; // geht nicht
    }

}
