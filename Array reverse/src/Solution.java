import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int number = s.nextInt();
		int swap = s.nextInt();
		int temp[] = new int[number];
		int temp2[] = new int[number];
		for (int i = 0; i < number; i++) {
			temp[i]= s.nextInt();
		}
		for(int j=0;j<swap;j++)
		{
			
			for (int i = 0; i < number-1; i++) 
			{
				temp2[i]=temp[i+1];
				
			}
			temp2[number-1]=temp[0];
			
			for (int i = 0; i < number; i++) 
			{	
				temp[i]=temp2[i];
				
			}
			
		}
		
		for (int i = 0; i < number; i++) {
			System.out.print(temp2[i]+ " ");
			
		}
		s.close();
	}
}
