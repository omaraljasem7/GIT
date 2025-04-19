package edges;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class EdgeTest {

    @Test
    public void testConstruction() throws EqualPointException {
        Edge e = new Edge(new Point(1, 2), new Point(2, 3));

        assertEquals(1, e.getX1());
        assertEquals(2, e.getY1());
        assertEquals(2, e.getX2());
        assertEquals(3, e.getY2());

     //   new Edge(new Point(1, 1), new Point(1, 1));

        assertThrows(IllegalArgumentException.class, new EdgeTestExecutable());

    }

}

class EdgeTestExecutable implements Executable {
    @Override
    public void execute() throws Throwable {
        new Edge(new Point(1, 1), new Point(1, 1));
    }
}

