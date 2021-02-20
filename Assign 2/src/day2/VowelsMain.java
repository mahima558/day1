package day2;
import java.util.Scanner;
public class VowelsMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the string:");
		String str= scanner.next();
		Vowels vowels=new Vowels();
		System.out.println("the total vowels in a string is:"+vowels.Vowels(str));
		
		

	}

}

