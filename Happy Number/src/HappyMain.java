import java.util.Scanner;

public class HappyMain
{
public static void main(String[] args) 
{
	Happy h=new Happy();
	Scanner s=new Scanner(System.in);
	int result = 0;
	int n=s.nextInt();
	if(n>9)
	{
		result=h.calculate(n);
		
	}
	else
	{
		System.out.println("Not Happy");
	}
	if(result==1)
	{
		System.out.println("Happy Number");
	}
	else
	{
		h.calculate(result);
	}
}
}
