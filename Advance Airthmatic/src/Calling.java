import java.util.Scanner;

class Advance 
{
	Scanner s=new Scanner(System.in);
	int temp=0;
	int n=s.nextInt();
	
	void calculate()
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				
				temp=temp+i;
			}
		}
		System.out.println(temp);
	}
}
class Calling
{
	public static void main(String[] args) {
		
		Advance a=new Advance();
		
		a.calculate();
		
	}
}