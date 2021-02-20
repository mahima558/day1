package com.service;

public class Rectangle extends Shape {
	double width1;
	double length;
	public Rectangle(double width1, double length) {
	    this.width1 = width1;
	    this.length = length;
	}

	@Override
	public float  calculateArea() {
	    // A = w * l
	    return (float) (width1 * length);
	}



}
