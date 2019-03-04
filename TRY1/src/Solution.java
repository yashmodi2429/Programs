
import java.util.Scanner;

 class Solution1
{
	
	static int calculate(int i,int b,int a)
	{
		int result=(int) (Math.pow(2, i)*b+a);
		//System.out.println("calculate "+result);
		return result;
	}
	static int cal(int i,int b)
	{
		int aa=(int) (Math.pow(2,i)*b);
		//System.out.println("cal "+aa);
		return aa;
	}
	static int c(int i,int b)
	{
		int a1=(int) (Math.pow(2,i)*b);
	//	System.out.println("cal "+a1);
		return a1;
	}
}

class Solution{
    public static void main(String []argh)
    {
        Scanner s = new Scanner(System.in);
        int a =0;
	     int b = 0;
	     int n=0;
        int t=s.nextInt();
        for(int i=0;i<t;i++)
        {
             a = s.nextInt();
             b = s.nextInt();
             n = s.nextInt();
        }
        for(int l=0;l<t;l++)
        {
        int aaa=0;
		int f=0;
			int sum=Solution1.calculate(0,b,a);
			System.out.print(sum+" ");
			
			
			int i=1;
			while(true)
			{
				
				aaa=Solution1.cal(i,b);
				f=sum+aaa;
				System.out.print(f+" ");
				
				for(int i1=2;i1<n;i1++)
				{
				int bbb1=Solution1.c(i1,b);
				f=f+bbb1;
				System.out.print(f+" ");
				}
				break;
			}
        }
			
		s.close();
		
	}
}
        