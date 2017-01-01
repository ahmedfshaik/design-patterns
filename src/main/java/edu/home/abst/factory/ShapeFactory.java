package edu.home.abst.factory;

public class ShapeFactory {
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
			/*
			 * //Create obj using reflection mechanism Class cobj = null; Circle
			 * c = null; try { cobj = Class.forName("Circle"); c =
			 * (Circle)cobj.newInstance(); } catch (Exception e) {
			 * e.printStackTrace(); } return c;
			 */
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
}
