import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int row = s.nextInt();
		int loop =row/2;
		for (int i = 0; i < loop; i++) {
			int j=0;
			while(j<=i)
			{
				System.out.print(start+" ");
				j++;
			}
			start++;
			System.out.println("");
		}
		
		for (int i = loop; i>0; i--) 
		{
			start--;
			int j=0;
			while(j<i)
			{
				System.out.print(start+" ");
				j++;
			}
			
			System.out.println("");
		}
		s.close();
	}
}
