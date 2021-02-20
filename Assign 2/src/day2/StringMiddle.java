package day2;

public class StringMiddle {
	public void middleString(String str){
		int len=str.length();
		int middle=len/2;
		if(middle%2==0){
			System.out.println("middle characters are:"+str.charAt(middle-1)+"and"+str.charAt(middle));
			
		}else{
			System.out.println("middle characters is:"+str.charAt(middle));
			
			
		}
	}


}
