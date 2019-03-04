import java.util.Scanner;

public class FirstMain
{
	public static void main(String[] args) 
	{
		First f=new First();                         // input 1012 
		 Scanner in = new Scanner(System.in);       //find digits program
	     int n=in.nextInt();
	     int a=n;
	     f.modulo(a);
	     in.close();
	}

}
