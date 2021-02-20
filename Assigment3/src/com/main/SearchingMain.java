package com.main;
import java.util.*;

public class SearchingMain {

	public static void main(String[] args) {
		Searching find= new Searching();
		System.out.println("Enter the size of the array:");
		Scanner in = new Scanner(System.in);
		int arraySize=in.nextInt();
		int[] array1=new int[arraySize];
		for(int i=0;i<arraySize;i++){
			System.out.println("enter"+i+"array elements:");
			array1[i] = in.nextInt();
			
		}
		System.out.println("enter the element to be search:");
		int number=in.nextInt();
		System.out.println(find.searchElement(array1,number));
		in.close();
		find=null;
		
		

	}

}
