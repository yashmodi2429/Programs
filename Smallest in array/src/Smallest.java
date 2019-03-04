
public class Smallest 
{
	public static void main(String[] args) 
	{
		//int temp;
		
		int a[]= {6,4,2,8};
		int small=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(small>a[i])
			{
				small=a[i];
				System.out.println(small);
			}
		}
		System.out.println("smallest number is "+small);
	}

}
