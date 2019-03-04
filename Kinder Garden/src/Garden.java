import java.util.Scanner;

public class Garden {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of students in a class");
		int no=s.nextInt();
		int a[]=new int[no];
		int time=0;
		int req_time=0;
		for(int i=0;i<no;i++)
		{
			a[i]=i;
			
		}
		System.out.println("enter position from where you want start collecting sheets");
		int pos=s.nextInt();
		for(int i=0;i<no;i++)
		{
			if(a[i]==pos)
			{
				
				System.out.println("student at position " + i + " get "+time +" extra time");
			}
			if(a[i]>pos)
			{
				req_time = req_time+1;
			
				System.out.println("student at position " + i + " get "+req_time +" extra time");
			}
			
		}
		//int next_reqtime=0;
		for(int i=0;i<pos;i++)
		{
			req_time= req_time + 1;
			System.out.println("student at position " + i + " get "+req_time +" extra time");
		}
		s.close();
	}

}
