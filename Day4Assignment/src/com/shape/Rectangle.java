package com.shape;

public class Rectangle implements Pollygon {
private float length;
private float breadth;
public Rectangle(float length, float breadth) {
	super();
	this.length = length;
	this.breadth = breadth;
}
public float getLength() {
	return length;
}
public void setLength(float length) {
	this.length = length;
}
public float getBreadth() {
	return breadth;
}
public void setBreadth(float breadth) {
	this.breadth = breadth;
}
@Override
public void callArea() {
	System.out.println("Area of Ractengle : "+(length*breadth));
	
}
@Override
public void calcPeri() {
	// TODO Auto-generated method stub
	
}

}
