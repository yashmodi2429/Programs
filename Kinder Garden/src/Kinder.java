import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Kinder 
{
public static void main(String[] args) 
{
	ArrayList v=new ArrayList();
	int t=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter number of students");
	int no=s.nextInt();
	for(int i=1;i<=no;i++)
	{
		v.add(i);
	}
	System.out.println("Enter position from where collection start");
	int position=s.nextInt();
	ListIterator itr=v.listIterator();
	while(itr.hasNext())
	{
		Integer I=(Integer)itr.next();
		if(position==I)
		{
			System.out.println("student position"+position+"get time"+t);
			t++;
			position++;
		}
		else
		{
			System.out.println("student number"+position+"get time"+t);
	        t++;
	        position++;
		}
		//t++;
	
	s.close();
}
}
}
