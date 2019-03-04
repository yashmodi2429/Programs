import java.util.Scanner;

public class Matrix 
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[][]=new int[n][n];
	int sum=0;
	int sum1=0;
	void elements()
	{
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			arr[i][j]=s.nextInt();
		}
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			if(i==j)
			{
				sum=sum+arr[i][j];
			}
			int j1=(n-(j+1));
			if(i==j1)
				{
					sum1=sum1+arr[i][j];
				}
		}
	}
	int ab=sum-sum1;
	int ab1=Math.abs(ab);
	System.out.println(ab1);
	//System.out.println(sum1 +" ");

}
}


