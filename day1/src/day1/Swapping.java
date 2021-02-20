package day1;

public class Swapping {
	public static void main(String[] args) {
		int input1=20;
		int input2=30;
		int temp;
		
		System.out.println("Before Swapping the two numbers are: input1,input2= "+input1+","+input2);
		
		temp=input1;
		input1= input2;
		input2=temp;
		System.out.println("After Swapping the two numbers are: input1,input2= "+input1+","+input2);
		
	}
}
