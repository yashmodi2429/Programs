
public class ST 
{
	int rev(int num)
	   {
		  int r1[]=new int[3];
		  int i=0;
		  while(num>0)
		  {
			 r1[i]=num%10;
			 System.out.println("r1 :"+r1);
			 num=num/10;
			 System.out.println("num : "+num);
			i++;
		  }
		  return r1[];
	  }

}
