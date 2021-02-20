package com.main;

import java.util.*;

public class Occurence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String ");
        String userInputString = scanner.nextLine();
        String newString = userInputString.replace('d', 'h');


		System.out.println("original string :"+userInputString);
		System.out.println("new string :"+newString);
		

	}

}
