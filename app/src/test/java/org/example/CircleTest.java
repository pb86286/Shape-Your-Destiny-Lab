package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void testCircleAreaPerimeter() {
        Circle circle = new Circle(2);
        assertEquals(Math.PI * 4, circle.getArea(), 0.001);
        assertEquals(2 * Math.PI * 2, circle.getPerimeter(), 0.001);
    }
}