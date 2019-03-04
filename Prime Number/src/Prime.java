import java.util.Scanner;

public class Prime
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int flag=0;
		int m=num/2;
		for(int i=2;i<=m;i++)
		{
			if(num%i==0)
			{
				System.out.println("Not a Prime Number :");
				flag=1;
				break;
			}
			
		}
		if(flag==0)
			{
				System.out.println("Prime number :");
			}
		s.close();
	}
}
