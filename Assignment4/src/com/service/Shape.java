package com.service;

public abstract class Shape {
	protected double height;
	protected double width;

	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public abstract float calculateArea();

	}



