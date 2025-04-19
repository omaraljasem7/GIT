package edges;

public class EqualPointException extends EdgeException {

    public EqualPointException(Point point) {
        super("Start and end point are equal: " + point);
    }
}
