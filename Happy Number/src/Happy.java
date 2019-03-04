
public class Happy 
{
	int calculate(int n)
	{
		int local=0;
		while(n>0)
		{
			int temp=n%10;
			local=local+(temp*temp);
			n=n/10;
			System.out.println(local);
		}
		return local;
	}
}
