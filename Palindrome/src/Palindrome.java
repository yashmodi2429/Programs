import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner ss=new Scanner(System.in);
		
		System.out.println("Enter a number or String :");
		String s=ss.nextLine();
		String result="";
		int n=s.length();
	    //System.out.println(n);
		for(int i=n-1;i>=0;i--)
		{
			result=result+s.charAt(i);
			System.out.println(result);
		}
		if(s.equals(result))
		{
			System.out.println("palindrome :");
			
		}
		else
		{
			System.out.println("Not a palindrome :");
		}
		ss.close();
		
	}
}
