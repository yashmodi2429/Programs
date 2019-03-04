import java.util.Scanner;

public class Reverse1 
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
		int len=name.length();
		String temp="";
		for(int x=len-1;x>=0;x--)
		{
			char ch=name.charAt(x);
			temp=temp+ch;
		}
		System.out.println("output is "+temp);
	}
}
