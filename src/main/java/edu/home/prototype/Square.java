package edu.home.prototype;

public class Square extends Shape {
	public Square() {
		System.out.println("***inside square constructor****");
		type = "Square";
	}

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
