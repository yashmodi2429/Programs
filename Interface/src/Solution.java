import java.util.Scanner;


class H
{
	int temp=0;
	int cal(int n)
	{
		for(int i=1;i<=n;i++)
		{
		if(n %i==0)
		{
			temp=temp+i;
		}
		}
		return temp;
	}
}
class Calcu
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		H h=new H();
		int n=s.nextInt();
		System.out.println(h.cal(n));
	}
}