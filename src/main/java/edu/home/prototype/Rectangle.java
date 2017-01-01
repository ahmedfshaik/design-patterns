package edu.home.prototype;

public class Rectangle extends Shape {
	public Rectangle() {
		System.out.println("***inside rectangle constructor****");
		type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
