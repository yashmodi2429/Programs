import java.io.InputStream;
import java.util.Scanner;

public class Binary 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=s.nextInt();
		int num[]=new int[n];
		int j=1;
		int sum=0;
		System.out.println("Enter binary value");
		for(int i=0;i<n;i++)
		{
			num[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(num[i]==0 || num[i]==1)
			{
				
			}
			else
			{
				System.exit(0);
			}
		}
		for(int i=n-1;i>=0;i--)
		{
		//	System.out.println(j);
			if(num[i]==1)
			{
				sum=sum+j;
				//System.out.println(sum);
			}
			j=j*2;
			
		}
		System.out.println("Decimal value of entered Binary number is "+sum);
	}

}
