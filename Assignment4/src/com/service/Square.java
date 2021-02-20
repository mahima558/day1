package com.service;

public class Square extends Shape{
	double width;
	
	public Square(double width) {
	    this.width = width;
	   
	}

		public float calculateArea()
	    {
	        return  (float) (width * width);
	    }

}
