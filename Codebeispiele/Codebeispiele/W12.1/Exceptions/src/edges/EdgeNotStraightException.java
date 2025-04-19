package edges;

public class EdgeNotStraightException extends EdgeException {

    public EdgeNotStraightException(Point start, Point end) {
        super("Either x-coordinates or y-coordinates must be same + (start: " + start + ", end: " + end + ")");
    }
}
