import java.util.Scanner;

class MyCalculator 
{
    
   static long power(int n, int p) 
    {
        if(n>=1 || p>=1)
        {
            long result=(long) Math.pow(n,p);
            return result;
        }
        else
        {
            
        }
		return 0;
    }
    
    
}

public class TryCatch 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		        while (in .hasNextInt()) 
		        {
		            int n = in .nextInt();
		            int p = in .nextInt();
		            
		            try 
		            {
		                System.out.println(MyCalculator.power(n, p));
		            } catch (Exception e) 
		            {
		                System.out.println(e);
		            }
		        }
		    }		
	}

