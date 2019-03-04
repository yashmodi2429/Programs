import java.util.*;
public class Solution 
{
    public static void main(String[] args) 
	 {
	    Scanner s=new Scanner(System.in);
	    int a[]=new int[3]; //{5,6,7};
		int b[]=new int[3]; // {3,6,10};
	    int count=0;
		int flag=0;
		
		public void enter()
		{
			for(int i=0;i<3;i++)
			{
				a[i]=s.nextInt(); 
			}
			for(int i=0;i<3;i++)
			{
				b[i]=s.nextInt();
			}
		}
		void triplet()
		{
			for(int i=0;i<3;i++)
			{
				if(a[i]>b[i])
				{
					count++;
				}
				else if(a[i]==b[i])
				{
					
				}
				else
				{
					flag++;
				}
			}
			System.out.println(count+" "+flag);
			
		}
	    }
	}

