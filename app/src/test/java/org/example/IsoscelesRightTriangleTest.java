package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsoscelesRightTriangleTest {
    @Test
    void testIsoscelesRightTriangleAreaPerimeter() {
        IsoscelesRightTriangle triangle = new IsoscelesRightTriangle(5);
        assertEquals(12.5, triangle.getArea(), 0.001);
        assertEquals(5 + 5 + Math.sqrt(50), triangle.getPerimeter(), 0.001);
        assertEquals(3, triangle.numberOfSides());
    }
}