import java.util.Scanner;

import java.util.*;

public class Fact 
{
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	s.close();
	int fact=1;
	
	while(num>1)
	{
		fact= fact*num;
		
		num--;
	}
	System.out.println("factorial is" +fact);
}
}
