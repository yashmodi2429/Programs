import java.util.Scanner;

public class Solution 
{
	Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    
    	int smallest;
    	int largest;
    	int[] a = new int[n];
        int out[]=new int[n];
        int sum=0;
        void calc()
        {
        	for(int i=0;i<n;i++)
        	{
        		a[i]=s.nextInt();
       		}
        	for(int i=0;i<n;i++)
            {
                sum=sum+a[i];
               // System.out.println("sum is "+sum);
            }
        	for(int i=0;i<n;i++)
            {
               out[i]=sum-a[i];
              // System.out.println("out "+out[i]);
            }
        }   
        int small=out[0];
        int large=out[0];
	   void calc1()
	   {
	   for(int i=0;i<n;i++)
		{
		   if(out[i] > large)
		   {
				large = out[i];
				//System.out.print("large "+ large+" ");
		   }
		   else if(out[i] < small)
			{
				small = out[i];
				//System.out.print("small "+small +" ");
			}
		  
		}
        System.out.println(large+" "+small);
	   }
    }
