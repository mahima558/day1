package com.main;
import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the no.of elements: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Ascending Order:");
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		
	}

}
