package day2;

public class Bike {
	public Bike(){
		System.out.println("Hello I am motorcycle Iam"+define_me());
		String temp = super.define_me();
		System.out.println("my ancester is a cycle who is"+ temp);
		
	}
	public String define_me(){
		return "a cycle with an engine";
		
	}

}
