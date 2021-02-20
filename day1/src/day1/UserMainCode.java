package day1;

public class UserMainCode {
	public static int SumOfSquaresOfEven(int n){
		int sum=0,r;
		while(n>0){
			r=n%10;
			if(r%2==0)
			{
				sum+=(r*r);
			}
			n=n/10;
		}
		return sum;
	}

}
