package edges;

public class StraightEdge extends Edge {

    public StraightEdge(Point start, Point end) throws EqualPointException, EdgeNotStraightException {
        super(start, end);
        if (start.getX() != end.getX() && start.getY() != end.getY())
            throw new EdgeNotStraightException(start, end);
    }
}
