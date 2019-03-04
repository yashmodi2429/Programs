//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	
	public static void main(String []argh)
	{
        int num = 0;
        String name="";
        Map<String,Integer> map=new HashMap<String,Integer>();
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++)
        {
        	System.out.println("enter name");
            name = in.next();
            System.out.println("enter num");
            num= in.nextInt();
            map.put(name,num);
            
        }
        String nam = in.next();
        if(nam.equals(name))
        {
            System.out.println(name+"="+map.get(num));
        }
        else{
            System.out.println("Not found");
        }
		in.close();
	}
}



