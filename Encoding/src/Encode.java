import java.util.Scanner;
import java.util.Scanner;;
public class Encode
{
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the total number of elements :");
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
	}
	/*for(int i=0;i<a.length;i++)
	{
		System.out.println("elements are");
		System.out.print(a[i]+" ");
	}
	*/
	int no=n*2;
	int b[]=new int[no];
	int count=0;
	System.out.println("Encoded Elements are :");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==1)
		{
			count++;
			
			if(count%2==0)
			{
				b[i]=a[i];
				System.out.print(b[i]+" ");
				b[i+1]=0;
				System.out.print(b[i+1]+" ");
			}
			else
			{
				b[i]=a[i];
				System.out.print(b[i]+" ");
			}
		}
		else
		{
			b[i+1]=a[i];	
			System.out.print(b[i+1]+" ");
		}
		
		
		
	}
}
}
