
public class Solution {
public static void main(String[] args) {
	int n =4;
	int space = n-1;
	for(int i=0;i<n;i++)
	{
		
		for(int j=0;j<space;j++)
		{
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
		space=space+2;
	}
}
}
