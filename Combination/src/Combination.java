
public class Combination {
      
	void factorial(int n,int m,int l)
	{
		int fact=1;
		while(n>1)
		{
			fact=fact*n;
			n--;
		}
		System.out.println("factorial of n "+fact);
		int fact1=1;
		
		while(m>1)
		{
			fact1=fact1*m;
			m--;
		}
		System.out.println("factorial of m "+fact1);
		int fact2=1;
		
		while(l>1)
		{
			fact2=fact2*l;
			l--;
		}
		System.out.println("factorial of l "+fact2);
		int temp=fact/(fact1*fact2);
		System.out.println("Total combination of nCr "+temp);
		
	}
}
