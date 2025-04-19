package edges;

public class StraightEdgeFactory extends EdgeFactory {

    @Override
    public Edge createEdge(Point start, Point end) throws EdgeNotStraightException, EqualPointException {
        return new StraightEdge(start, end);
    }

}
