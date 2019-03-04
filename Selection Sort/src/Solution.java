import java.util.Scanner;

public class Solution 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
	}
	int key=0;
	int small=0;
	int temp=0;
	for(int i=0;i<a.length;i++)
	{
		 key=a[i];
		// System.out.println(key+" ");
		 for(int j=0;j<a.length;j++)
			{
				if(key>a[j])
				{
					key=a[j];
					
				}
				System.out.print(key+" ");
			}
	}
	
	s.close();
}
}
