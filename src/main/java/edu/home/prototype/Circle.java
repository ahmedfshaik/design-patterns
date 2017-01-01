package edu.home.prototype;

public class Circle extends Shape {
	public Circle() {
		System.out.println("***inside circle constructor****");
		type = "Circle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
