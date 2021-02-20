package com.service;

public class FristClass {
	 int a = 100; 

	    public FristClass(){

	        System.out.println("in the constructor of class FristClass: "); 

	        System.out.println("a = "+a); 

	        a = 333; 

	        System.out.println("a = "+a); 

	    } 

	    public int getFristClass() { 

	        return a;

	    } 

	    public void setFristClass(int value) { 

	        a=value; 

	    } 

}
