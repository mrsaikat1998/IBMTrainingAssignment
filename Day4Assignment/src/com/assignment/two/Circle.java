package com.assignment.two;

public class Circle implements Shape {

	private double radius;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return 3.14 * radius * radius;
	}

}
