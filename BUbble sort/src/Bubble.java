
public class Bubble 
{

public static void main(String[] args) 
{
	int a[]= {5,4,1,2,7,0,8};
	int temp=0;
	for(int k=0;k<a.length;k++) //This loop is for iterate till total number of elements means total number of elements in array.
	{
	for(int i=0;i<a.length;i++)
	{
		for(int j=1+i;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
			temp=a[j];  //these three line code is for swapping
			a[j]=a[i];
			a[i]=temp;
			break;
			}
			break;
		}
		
	}
	}
	for(int i=0;i<a.length;i++) //this loop is to print total sorted elements  
	{
		System.out.println(a[i]);
	}
	}
}
