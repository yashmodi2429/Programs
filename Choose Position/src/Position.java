import java.util.Scanner;

public class Position {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the total number of elements you want to enter ?");
		int no=s.nextInt();
		int position = 0;
		int temp=0;
		
		int a[]=new int[no];
		int b[]=new int[no];
		System.out.print("enter elements");
		for(int i=0;i<no;i++)
		{
			a[i]=s.nextInt();
			
		}
		System.out.println("enter position");
		for(int i=0;i<no;i++)
		{
			position=s.nextInt();
			
			b[i]=a[position];
			temp=b[i];
			System.out.println("entered position is "+position+" Swaped element is "+temp+" at index "+ i);
			//System.out.println(a[i]);
			//System.out.println(temp);
			
		}
		
		
		s.close();
		
		}

}
