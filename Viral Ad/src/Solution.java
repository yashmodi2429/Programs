import java.util.*;
public class Solution{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        int days = s.nextInt();
        int flag =0;
        int totalshare = 5;
        int temp[] = new int[days];
        for(int i=0;i<days;i++)
        {
        	 temp[i] = (totalshare/2);
        	 totalshare = temp[i]*3;
        }
        int j =0 ;
        while(j < temp.length)
        {
        	flag = flag +temp[j];
        	j++;
        }
        System.out.println(flag);
        s.close();
    }
}