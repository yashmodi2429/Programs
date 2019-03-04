import java.util.Scanner;

public class T 
{

	//Scanner s=new Scanner(System.in);
	//int no=s.nextInt();
	int no;
	int sum=0;
	int check(int a)
	{
	while(no>0)
		
	{
		int rem=no%10;
		sum=sum+(rem*rem);
		no=no/10;
	}
	System.out.println(sum);
	return no;
	}
}
