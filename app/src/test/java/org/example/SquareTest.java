package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void testSquareAreaPerimeter() {
        Square square = new Square(4);
        assertEquals(16, square.getArea(), 0.001);
        assertEquals(16, square.getPerimeter(), 0.001);
        assertEquals(4, square.numberOfSides());
    }
}