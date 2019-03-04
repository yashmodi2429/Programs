
public class Strong 
{
	
   int rev(int num)
   {
	  int sum=0; 
	  int r1=0;
	  while(num>0)
	  {
		 r1=num%10;
		 System.out.println("r1 :"+r1);
		 num=num/10;
		 System.out.println("num : "+num);
		 int fact=1;
			while(r1>1)
			{
				fact= fact*r1;
				
				r1--;
			}
			System.out.println("factorial is "+fact);
		
			sum=sum+fact;
			
	  }
	  return sum;
  }
}
