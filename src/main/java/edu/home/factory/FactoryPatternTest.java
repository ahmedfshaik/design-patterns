package edu.home.factory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		// Get an object of Circle and call its draw method.
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw(); // call draw method of Circle
		// Get an object of Rectangle and call its draw method.
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw(); // call draw method of Rectangle
		// Get an object of Square and call its draw method.
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw(); // call draw method of circle

	}

}
