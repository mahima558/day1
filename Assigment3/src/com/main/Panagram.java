package com.main;
import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
			int i,count = 0;
			System.out.println("enter the sentence:");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine().toLowerCase();
		    int[] a = new int[26];
			for (i = 0; i < s.length(); i++) {
				if (s.charAt(i) >= 97 && s.charAt(i) <= 122){
					if(a[s.charAt(i)-97]==0){
					  count++;
		                a[s.charAt(i)-97]++;
					}
				}
			}
			System.out.println(count);

			if (count ==26) {
				System.out.println("Pangram");
			} else
				System.out.println("not Pangram");
		}

	}


