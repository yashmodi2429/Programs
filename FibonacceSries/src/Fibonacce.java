import java.util.Scanner;

class Fibonacce
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int count=s.nextInt();
		s.close();
		int n1=0;
		int n2=1;
		System.out.println(n1+"\n"+n2);
		for(int i=2;i<=count;++i)
		{
			int n3 = n1 + n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}