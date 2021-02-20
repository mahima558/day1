package com.main;

import java.util.Scanner;

public class MainAppEight {

	public static void main(String[] args) {
		ProblemEight pEight =new ProblemEight();
		System.out.println("enter a string:");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println("resultant String:" +pEight.checkString(str));
		in.close();
		pEight = null;

	}

}
