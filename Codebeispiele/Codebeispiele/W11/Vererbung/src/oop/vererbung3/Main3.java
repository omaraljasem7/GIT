package oop.vererbung3;

public class Main3 {

    public static void main(String[] args) {
        Polygon p = new Polygon(
                new Edge[]{new Edge(3, 4, 5, 11),
                        new Edge(5, 11, 12, 8),
                        new Edge(12, 8, 9, 5),
                        new Edge(9, 5, 5, 6),
                        new Edge(5, 6, 3, 4)});

        EdgeSet es = new EdgeSet(
                new Edge[]{new Edge(3, 4, 5, 11),
                        new Edge(5, 11, 12, 8),
                        new Edge(12, 8, 9, 5),
                        new Edge(9, 5, 5, 6)});

        System.out.println(p.length());
        System.out.println(es.length());
        System.out.println(p.area());

        EdgeSet es2 ;
        if (System.currentTimeMillis() % 6 == 0) {
            es2 = p;
        } else {
            es2 = new Trajectory(new Edge[]{new Edge(3, 4, 5, 11),
                    new Edge(5, 11, 12, 8),
                    new Edge(12, 8, 9, 5),
                    new Edge(9, 5, 5, 6)});
        }

        Polygon p2 = (Polygon) es2;
        System.out.println(p2.area());

        es.insert(new Edge(1, 2, 3, 4));
        es.insert(new Edge[]{new Edge(1, 2, 3, 4)});

//        Trajectory t = p;
//
//        es2 = t;


    //    es.area();  // geht nicht

        //    Shape s = p;
        //    ClosedShape cs = p;

        //ClosedShape cs2 = es; // nicht erlaubt
        //   System.out.println(es.area()); // Der Compiler verbietet diesen Aufruf!

    }

}
