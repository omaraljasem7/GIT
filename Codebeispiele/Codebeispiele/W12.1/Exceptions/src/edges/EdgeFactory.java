package edges;

public abstract class EdgeFactory {

    private static EdgeFactory factory;

    public static EdgeFactory getFactory() {
        return factory;
    }

    public static void initializeForPlainEdges() {
        if (factory != null) {
            throw new IllegalStateException("Factory already initialized.");
        }
        factory = new PlainEdgeFactory();
    }

    public static void initializeForStraightEdges() {
        if (factory != null) {
            throw new IllegalStateException("Factory already initialized.");
        }
        factory = new StraightEdgeFactory();
    }

    public abstract Edge createEdge(Point start, Point end) throws EdgeException;

}
