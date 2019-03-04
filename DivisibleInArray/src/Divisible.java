import java.util.Scanner;
import java.util.Arrays;
public class Divisible {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		//int count;
		int a[] = new int[n];
		int b[] =new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
for(int i=0;i<n;i++)
{
	if(a[i]%3==0)
	{
		b[i]=a[i];
	}
}
for(int i=0;i<n;i++)
{
	System.out.println(b[i]);
}
for(int i=0;i<n;i++)
{
	//count =0;
	for(int j=i+1;j<n;j++)
	{
		if(b[i]==b[j])
		{
			b[j]=0;
		}
	}
}
for(int i=0;i<n;i++)
{
	System.out.println(b[i]);
}
	}

}
