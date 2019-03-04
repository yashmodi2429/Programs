import java.util.Scanner;

public class Binary {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter number to change in binary");
	int num=s.nextInt();
	String output="";
	while(num>0)
	{
		int rem=num%2;
		output=rem+output;
		num=num/2;
		
	}
	System.out.println(output);
}
}
