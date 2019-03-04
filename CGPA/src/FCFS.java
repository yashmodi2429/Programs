import java.util.Scanner;

public class FCFS {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int priority=0;
		System.out.println("Enter the Total number of input ?");
		int no=s.nextInt();
		int a[]=new int[no];
	/*	for(int i=0;i<no;i++)
		{
			a[i]=i;
			
		} */
		System.out.println("enter CGPA");
		for(int i=0;i<no;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<no;i++)
		{
			for(int j=1;j<no;j++)
			{
				if(a[i]<a[j])
				{
					priority=a[j];
				}
				else
				{
					priority=a[i];
				}
			}
			//System.out.println("highest prioruty "+ priority);
		}
		System.out.println("highest prioruty "+ priority);
		s.close();
	}

}
