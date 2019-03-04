import java.io.*;
import java.util.Scanner;
	
public class Camel 
{
	static int camelcase(String s) 
	    {
	        String[] words = s.split("[A-Z]");  //Split the String on the Basis o (iLoveJavaProgramThankYou)
	        int sum=words.length;
	        return sum;
	    }

	    public static void main(String[] args) 
	    {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        int result = camelcase(s);
	        System.out.println(result);
	        in.close();
	    }
	}


