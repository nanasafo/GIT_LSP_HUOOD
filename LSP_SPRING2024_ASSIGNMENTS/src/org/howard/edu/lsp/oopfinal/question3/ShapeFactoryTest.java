package org.howard.edu.lsp.oopfinal.question3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShapeFactoryTest {
    @Test
    void testCreateCircle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createShape("CIRCLE");
        Assertions.assertTrue(shape instanceof Circle);
    }

    @Test
    void testCreateRectangle() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createShape("RECTANGLE");
        Assertions.assertTrue(shape instanceof Rectangle);
    }

    @Test
    void testCreateInvalidShape() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createShape("INVALID");
        Assertions.assertNull(shape);
    }
}