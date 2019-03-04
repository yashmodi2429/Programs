import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        int total=0;
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
        	a[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
        	if(a[i]>0)
        	{
        		count++;
        	}
        	for(int j=1;j<n;j++)
        	{
        		total=total+a[i+j];
        		if(total<0)
        		{
        			count++;
        		}
        	}
        	break;
        }
        for(int i=0;i<n;i++)
        {
        	sum=sum+a[i];
        	count++;
        }
        scan.close();
        System.out.println(count);
     }
}