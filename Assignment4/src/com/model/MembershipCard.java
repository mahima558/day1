package com.model;

public class MembershipCard {
	int radius = 5;
	Shape circle = new Circle(radius);
	System.out.println("Circle radius: " + radius + "\nResulting Area: " + circle.calculateArea() + "\n");


	double width = 6;
    Shape square = new Square(width);

