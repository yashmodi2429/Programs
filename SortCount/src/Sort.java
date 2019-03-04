import java.util.Scanner;
public class Sort {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int count =1;
	int check=0;
	System.out.println("Enter The SIze of Array ?");
	int n= s.nextInt();
	int a[] = new int[n];
	System.out.println("Enter The Elements Of Array ?");
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println("Sorted Array is !!!");
	for(int k=0;k<n;k++)
	{
	for(int i=0;i<n;i++)
	{
	int flag=0;
	//System.out.println("value of a[i] is : " +a[i]);
	check=a[i];
	for(int j=0;j<n;j++)
	{
		//System.out.println("a[j] "+a[j]);
		if(check == a[j])
		{
			flag++;
			//System.out.println("Flag is "+ flag);
		}
	}
	if(flag==count)
		System.out.println("flag==count" +flag +" "+count+" number is :"+check);
	}
	count++;
	}
	
}
}
