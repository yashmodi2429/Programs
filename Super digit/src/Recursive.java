

public class Recursive 
{
	
	void calculate(long num)
	{
		long sum=0;
		while(num>0)
		{
			long temp=num%10;
			sum=sum+temp;
			num=num/10;
			//System.out.println(sum);
			
		}
		if(sum>10)
		{
			//System.out.println("final "+result);
			calculate(sum);
		}
		else
		{
			System.out.println("final sum is "+sum);
		}
		
		
	}
		
}	


