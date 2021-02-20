package com.main;
import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		System.out.println("enter the string:");
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String reverse = new StringBuffer(A).reverse().toString();
		if (A.equals(reverse))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
