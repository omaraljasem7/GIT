package oop.vererbung2;

public class Main2 {

    public static void main(String[] args) {
        OneClass p = new OneClass(
                new Edge[]{new Edge(3, 4, 5, 11),
                        new Edge(5, 11, 12, 8),
                        new Edge(12, 8, 9, 5),
                        new Edge(9, 5, 5, 6),
                        new Edge(5, 6, 3, 4)}, true);

        OneClass es = new OneClass(
                new Edge[]{new Edge(3, 4, 5, 11),
                        new Edge(5, 11, 12, 8),
                        new Edge(12, 8, 9, 5),
                        new Edge(9, 5, 5, 6)}, false);

        p.length();
        es.length();
        System.out.println(p.area());

        OneClass neu = p;
        neu = es;

        System.out.println(es.area()); // sollte nicht erlaubt sein!
//        System.out.println(p.area() + es.area()); // sollte nicht erlaubt sein!
    }

}
