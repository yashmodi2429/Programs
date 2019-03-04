import java.util.Scanner;

public class RecursiveMain 
{
	public static void main(String[] args) throws Exception
	{
	Recursive h=new Recursive();
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	int k=s.nextInt();
	String temp="";
	while(k>0)
	{
		temp+=num;
		k--;
	}
	System.out.println(temp);
	//h.calculate(Integer.parseInt(temp));
	h.calculate(Long.parseLong(temp));
	s.close();
	}
	
}
