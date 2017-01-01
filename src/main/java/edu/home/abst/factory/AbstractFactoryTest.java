package edu.home.abst.factory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		AbstractFactory abstractFactory = new AbstractFactory();
		ShapeFactory shapeFactory = abstractFactory.getShapeFactory();
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		ColorFactory colorFactory = abstractFactory.getColorFactory();
		Color color = colorFactory.getColor("RED");
		color.fill();

	}

}
