package com.main;
import java.util.Scanner;

public class AcceptString {
	public static void main(String[] args) {
    	System.out.println("enter the string:");
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println("enter the two indices:");
        Scanner sc1=new Scanner(System.in);
        int start = sc1.nextInt();
        int end = sc1.nextInt();
        
        System.out.println(S.substring(start,end));
    }

}
