import java.util.Scanner;

public class Birthday 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.print("enter the age of Birthday Boy ");
	int n=s.nextInt();
	int a[]=new int[n];
	int count=0;
	
	System.out.print("Enter the size of Candle's ");
	int largest=a[0];
	
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}

	for(int i=0;i<n;i++)
	{
		if(largest<=a[i])
		{
			largest=a[i];
			System.out.println(largest);
		}
	}
	
	System.out.println("largest number in array is "+largest+" ");
		for(int i=0;i<n;i++)
	{
		if(largest==a[i])
		{
			count++;
		}
	}
	//count++;
	System.out.println("number of candle blow is "+count);
s.close();
}
}
