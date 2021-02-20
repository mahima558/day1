package com.main;

public class Package {
	public int add(int a, int b){
		return a+b;
	   }
	  
	public static void main(String[] args) {
		Package obj = new Package();
		System.out.println(obj.add(10, 20));
		

	}

}
