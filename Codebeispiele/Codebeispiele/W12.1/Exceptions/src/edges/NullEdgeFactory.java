package edges;

public class NullEdgeFactory extends EdgeFactory {
    @Override
    public Edge createEdge(Point start, Point end) {
        return null;
    }
}
