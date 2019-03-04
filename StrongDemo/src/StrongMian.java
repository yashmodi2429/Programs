import java.util.Scanner;

public class StrongMian 
{
	public static void main(String[] args) {
		ST obj=new ST();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=s.nextInt();
		int n=3;
		int sum=0;
		while(n>0)
		{
			int result=obj.rev(num);
			System.out.println(result);
			int fact=1;
			while(result>1)
			{
				fact= fact*result;
				
				result--;
			}
			System.out.println("factorial is "+fact);
		
			sum=sum+fact;
			n--;
		}
		if(sum==num)
		{
			System.out.println("Strog number");
		}
		else
		{
			System.out.println("Not Strong umber ");
		}
		s.close();
	}
}
