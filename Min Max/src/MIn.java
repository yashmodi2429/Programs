import java.util.Scanner;

public class MIn 
{
	static int largest;
	static int smallest;
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	int sum=0;
	
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		sum=sum+a[i];
	}
	System.out.println(sum);
	for(int i=0;i<n;i++)
	{
		a[i]= sum-a[i];
		System.out.print(a[i]+" ");
	}
	for(int i=0;i<n;i++)
	{
		for(int j=1;j<n;j++)
		{
			if(a[i]>=a[j])
			{
				largest=a[i];
				smallest=a[j];
			}
			
		}
		break;
	}

	System.out.println("smallest "+smallest);
	System.out.println("largest "+largest);
}
}