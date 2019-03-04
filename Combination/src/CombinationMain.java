import java.util.Scanner;

public class CombinationMain 
{
	public static void main(String[] args) {
		Combination c=new Combination();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n=s.nextInt();
		System.out.println("Enter the value of m");
		int m=s.nextInt();
		System.out.println("Difference of n - m");
		int l=n-m;
		System.out.println(l);
		if(n>m)
		{
			c.factorial(n,m,l);
		}
		else
		{
			System.out.println("enter the value of m greater than n");
		}
		s.close();
		
	}
	
}
