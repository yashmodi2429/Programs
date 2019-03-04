class AmstrongNumber
{
	public static void main(String[] args) 
	{
	int c=0,a;
	
	int n=371;
	int temp=n;			// we do this because at last in if condition when we compare with n it gives not amstrong as 
						// value of n is updated to 0 in while loop whic is not equal to 371 
		while(n>0)
		{
		   a=n%10;
		   n=n/10;
		   c=c+(a*a*a);
			
		}
		System.out.println(c);
//		System.out.println(n);
		if(temp==c)				
		{
			System.out.println("amstrong number");
		}
		else
		{
			System.out.println("not amstrong");
		}
	}
}