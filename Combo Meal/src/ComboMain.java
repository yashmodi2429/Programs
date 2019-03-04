import java.util.Scanner;

public class ComboMain 
{
	public static void main(String[] args) 
	{
		Combo com=new Combo();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the total number of iteration perform ");
		int n=s.nextInt();
		int burger = 0;
		int soda=0;
		int combo=0;
		for(int i=0;i<n;i++)
		{
			burger=s.nextInt();
			soda=s.nextInt();
			combo=s.nextInt();
	
		int result=com.profit(burger,soda,combo);
		System.out.println(result);
		}
		s.close();
	}
}
