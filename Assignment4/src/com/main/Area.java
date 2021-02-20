package com.main;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius = 5;
		Shape circle = new Circle(radius);
		System.out.println("Circle radius: " + radius + "\nResulting Area: " + circle.calculateArea() + "\n");
	
	
		double width = 6;
        Shape square = new Square(width);
        System.out.println("square width: " + width 
                + "\nResulting area: " +square.calculateArea()+"\n");
        
        double width1 = 5, length = 7;
        Shape rectangle = new Rectangle(width1, length);
        System.out.println("Rectangle width: " + width1 + " and length: " + length
                + "\nResulting area: " + rectangle.calculateArea()+"\n");
                
	
	}

public float calculateArea(){
		return pi*radius*radius;
	

	}

}
