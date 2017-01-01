package edu.home.prototype;

public class PrototypePatternTest {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		System.out.println("Shape : " + ((Shape) ShapeCache.getShape("1")).getType());
		System.out.println("Shape : " + ((Shape) ShapeCache.getShape("1")).getType());
		System.out.println("Shape : " + ((Shape) ShapeCache.getShape("2")).getType());
		System.out.println("Shape : " + ((Shape) ShapeCache.getShape("2")).getType());
		System.out.println("Shape : " + ((Shape) ShapeCache.getShape("3")).getType());
		System.out.println("Shape : " + ((Shape) ShapeCache.getShape("3")).getType());

	}

}
