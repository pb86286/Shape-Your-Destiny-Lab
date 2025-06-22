package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RightTriangleTest {
    @Test
    void testRightTriangleAreaPerimeter() {
        RightTriangle triangle = new RightTriangle(3, 4);
        assertEquals(6, triangle.getArea(), 0.001);
        assertEquals(12, triangle.getPerimeter(), 0.001);
        assertEquals(3, triangle.numberOfSides());
    }
}