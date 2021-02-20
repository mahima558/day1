package day2;

import java.util.Scanner;
public class StringMiddleMain {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("enter the string");
		String str=Scanner.next();
		StringMiddle stringMiddle = new StringMiddle();
		stringMiddle.middleString(str);

	}

}
