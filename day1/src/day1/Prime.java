package day1;

public class Prime {
	public static void main(String[] args) {
		int num =29;
		boolean flag =false;
		for(int i=2;i<=num/2;i++){
			if( num%i== 0){
				flag=true;
				}
				
			}
	   if(!flag){
		   System.out.println(num +"it is a prime number");
	   }else{
		   System.out.println(num+"it is not a prime number");
	   }

	}


}
