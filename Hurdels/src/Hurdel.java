import java.util.Arrays;
import java.util.Scanner;

public class Hurdel {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int dose =0;
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		
		int max = arr[n-1];
		System.out.println("Max Hurdel "+ max);
		int danHeight = k;
		if(max > danHeight)
		{
			dose = max - danHeight;
		}
		System.out.println("Dose = "+ dose);
		s.close();
	}
}
