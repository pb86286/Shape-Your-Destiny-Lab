package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void testRectangleAreaPerimeter() {
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(20, rectangle.getArea(), 0.001);
        assertEquals(18, rectangle.getPerimeter(), 0.001);
        assertEquals(4, rectangle.numberOfSides());
    }
}