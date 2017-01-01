package edu.home.abst.factory;

public class AbstractFactory {
	public ShapeFactory getShapeFactory() {
		return new ShapeFactory();
	}

	public ColorFactory getColorFactory() {
		return new ColorFactory();
	}
}
