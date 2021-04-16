package com.shape;

public class Square implements Pollygon {
	private float side;

	public Square(float side) {
		this.side = side;
	}

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

	@Override
	public void callArea() {
		System.out.println("Area of Square : " + (side * side));

	}

	@Override
	public void calcPeri() {
		System.out.println("Square Perimeter : " + (4 * side));
	}

}
