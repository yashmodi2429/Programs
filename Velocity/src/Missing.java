import java.util.Scanner;
class MissingCheck
{
private int[] b;
private int n;

public void check(int i) {
	int count=0;
	for(int j=0;j<n;j++)
	{
		System.out.println(b[i]+" array");
	}
	
//	return 0;
}

}
public class Missing {
public static void main(String[] args) {
	MissingCheck mc =new MissingCheck();
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the Size of Array ?");
	int n= s.nextInt();
	int a[] = new int[n];
	int b[] =new int[n];
	int small = 0;
	int large =0;
	mc.check(n);
	System.out.println("Enter Elements ?");
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
		b[i]=a[i];
	}
	System.out.println("Elements of array are =");
	//for(int i=0;i<n;i++)
	//{
		//System.out.print(" "+a[i]);
	//}
	//System.out.println("Smallest in array is ");
	for(int i=0;i<n;i++)
	{
		small = a[i];
		large =a[i];
		
		for(int j=i;j<n;j++)
		{
			if(small>a[j])
			{
				small = a[j];
				
			}
			else if(small < a[j])
			{
				//System.out.println("LG "+ small +" "+a[j]);
				large= a[j];
			}
		}
		break;
	}
	System.out.println("small is "+small);
	System.out.println("Large is "+ large);
	
}
}
