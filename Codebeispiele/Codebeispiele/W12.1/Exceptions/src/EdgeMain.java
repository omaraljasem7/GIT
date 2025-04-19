import edges.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EdgeMain {

    public static void main(String[] args) throws EqualPointException {
        EdgeFactory.initializeForStraightEdges();
        try {
            Edge e0 = EdgeFactory.getFactory().createEdge(new Point(1, 2), new Point(3, 4));
        } catch (EdgeException e) {
            e.printStackTrace();
        }

//        try {
//            Edge e1 = new Edge(null, null);
//            System.out.println("E1: " + e1);
//            System.out.println(e1.length());
            Edge e2 = new Edge(new Point(1, 2), new Point(1, 2));
            System.out.println("E2: " + e2);

            Edge e3 = new Edge(new Point(1, 2), new Point(3, 3));
            System.out.println("E3: " + e3);
//        }
//        catch(NullPointerException | EqualPointException e) {
//            Logger.getGlobal().log(Level.WARNING, "Could not create edges.");
////            Logger.getGlobal().log(Level.WARNING, "Could not create edges.", e);
//            System.out.println("Afterlogger");
//            System.err.println("Error");
//        }
//        catch(Exception err) {
//            Logger.getGlobal().log(Level.SEVERE, "Could not create edges.", err);
//        }
        System.out.println("Program terminated");
    }
}
