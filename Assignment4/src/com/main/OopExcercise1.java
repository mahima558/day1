package com.main;
import com.service.*;
import com.model.*;
public class OopExcercise1 {
	public static void main(String[] args) { 

        FristClass objA = new FristClass(); 

        SecondClass objB = new SecondClass(); 

        System.out.println("in main(): "); 

        System.out.println("objA.a = "+objA.getFristClass()); 

        System.out.println("objB.b = "+objB.getSecondClass()); 

        objA.setFristClass(222); 

        objB.setSecondClass(333.33); 

        System.out.println("objA.a = "+objA.getFristClass()); 

        System.out.println("objB.b = "+objB.getSecondClass()); 

    } 

}
