package com.main;
import com.model.MyCalculator;
import com.model.AdvanceArithematic;
import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdvanceArithematic mycalculator = new MyCalculator();
		Scanner scanner = new Scanner(system.in);
		System.out.println("enter the number");
		int num=scanner.nextInt();
		System.out.println("i implemented; AdvancedArithematic");
		System.out.println(mycalculator.divisor_sum(num));
		
	}

}
