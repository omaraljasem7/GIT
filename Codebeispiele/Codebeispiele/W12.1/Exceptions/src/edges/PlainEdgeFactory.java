package edges;

public class PlainEdgeFactory extends EdgeFactory {
    @Override
    public Edge createEdge(Point start, Point end) throws EdgeException {
        return new Edge(start, end);
    }
}
