import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestShapes {

        @Test
    void testOctagon() {
        Octagon o = new Octagon(4);
        assertEquals(8 * 4, o.getPerimeter(), 0.01);
    }

    @Test
    void testSquare() {
        Square s = new Square(5);
        assertEquals(4 * 5, s.getPerimeter(), 0.01);
    }

    @Test
    void testEquilateralTriangle() {
        EquilateralTriangle t = new EquilateralTriangle(6);
        assertEquals(3 * 6, t.getPerimeter(), 0.01);
    }
}

