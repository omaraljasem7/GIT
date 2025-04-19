package edges;

public class FailEdgeFactory extends EdgeFactory {
    @Override
    public Edge createEdge(Point start, Point end) { //das wäre nicht erlaubt: throws Exception {
        return null;
    }
}
