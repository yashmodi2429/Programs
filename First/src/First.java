
public class First 
{
	int count=0;
	int  x,x1,a;
	
	void modulo(int n)
	{
	 while(n!=0)
	{
		x1=n%10;
		System.out.println("% "+x1);
		if(x1!=0)
		{
			if(a%x1==0)
			{
				count++;
				//System.out.println(count);
				
			}
		}
		
		
		n=n/10;
		System.out.println("/ "+n);
		
	}
	 System.out.println(count);
	}
	
	
}
