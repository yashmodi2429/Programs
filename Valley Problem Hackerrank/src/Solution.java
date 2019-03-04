import java.util.*;
public class Solution {
public static void main(String [] args)
{
    Scanner scanner = new Scanner(System.in);
    int Down =0;
    int Up =0;
    char c1 = 'D';
    char c2 = 'U';
    int n = scanner.nextInt();
    String a ="";
    System.out.println(n);
    
        a= scanner.next();
        for(int i=0;i<n;i++)
    {
    	System.out.println(a.charAt(i));
    }
    for(int i=0;i<n;i++)
    {
        if(a.charAt(i)==c1)
        {
           ++Down;
        }
        if(a.charAt(i)==c2)
        {
            ++Up;
        }
    }
    int local = Down - Up;
    System.out.println(Math.abs(local));
    scanner.close();
}
}