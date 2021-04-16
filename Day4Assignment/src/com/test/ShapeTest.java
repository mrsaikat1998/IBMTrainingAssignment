package com.test;

import com.shape.Rectangle;
import com.shape.Square;

public class ShapeTest {

	public static void main(String[] args) {
		Square square=new Square(4.0f);
		Rectangle rectangle =new Rectangle(4.6f, 15.2f);
		
		square.calcArea();
		square.calcPeri();
		rectangle.calcArea();
		rectangle.calcPeri();
	}

}
