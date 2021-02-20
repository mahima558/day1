package day1;

public class EvenOdd {
	public static int CheckSum(int a){
		int sum=0,r;
		while(a!=0){
			r=a%10;
			a=a/10;
			if(r%2!=0)
			{
				sum+=r;
			}
					
		}
		if(sum%2!=0)
		{
			return 1;
		}else{
			return-1;
		}
		
	}

}
