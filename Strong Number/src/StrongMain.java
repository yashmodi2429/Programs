import java.util.Scanner;

public class StrongMain 
{
	public static void main(String[] args) {
		Strong obj=new Strong();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=s.nextInt();
		
		int result=obj.rev(num);
	    System.out.println(result);
			
		if(num==result)
		{
			System.out.println("Strog number");
		}
		else
		{
			System.out.println("Not Strong umber ");
		}
		s.close();
	}

}
