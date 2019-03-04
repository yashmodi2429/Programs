import java.util.Scanner;

public class Stair 
{
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Total number of Stair case");
	int n=s.nextInt();
	for(int i=0;i<n;i++)
	{
		for(int j=1+i;j<n;j++)
		{
			System.out.print(" ");  //print empty space
		}
		for(int k=n-i;k<=n;k++)    
		{
			System.out.print("#");   //for print any symbol
		}
		System.out.println("");    //for change line 
	}
	s.close();
}
}
