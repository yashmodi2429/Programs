import java.util.*;

public class Solution {
 public static void main(String[] args) {
	
	int count =0;
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
		
	}
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	for (int j = 0; j < n-1; j++) {
		if(arr[j]==arr[j+1])
		{
			System.out.println("compare "+ arr[j]+ " = " + arr[j+1]);
			count++;
			j++;
		}
		else
		{
			System.out.println("not compare "+ arr[j]+" != " + arr[j+1]);
		}
	}
	System.out.println(count);
	
}
}
