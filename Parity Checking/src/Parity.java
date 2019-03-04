import java.util.Scanner;

public class Parity 
{
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int [10];
	System.out.println("enter only binry numbers");
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	int count=0;
	for(int i=0;i<n;i++)
	{
	if(a[i]==0 || a[i]==1)
	{
		
			if(a[i]==1)
			{
				count++;
			}
		
	}
	else
	{
		System.out.println("Oops ! enter binary numbers only");	
		System.exit(0);
	}
	}
	if(count%2==0)
	{
		for(int i=0;i<n;i++)
		{
		System.out.println("elements are "+a[i]);
		}
	}
	else
	{
		a[n]=1;
		System.out.println("new even parity elements are");
		for(int i=0;i<=n;i++)
		{
			System.out.println("elements are "+a[i]);
		}
	}
	
	s.close();
}

}
