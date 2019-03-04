import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int count=0;
	int flag=0;
	int start = s.nextInt();
	int end = s.nextInt();
	int applePosition = s.nextInt();
	int OrangePosition=s.nextInt();
	int noApple = s.nextInt();
	int noOrange = s.nextInt();
	int apple[]=new int[noApple];
	int orange[]=new int[noOrange];
	for (int i = 0; i < apple.length; i++) {
		apple[i]= s.nextInt();
	}
	for (int i = 0; i < orange.length; i++) {
		orange[i]=s.nextInt();
	}
	for (int i = 0; i < orange.length; i++) {
		orange[i]=OrangePosition+orange[i];
	}
	for (int i = 0; i < apple.length; i++) {
		apple[i]= applePosition+apple[i];
	}
	for (int i = 0; i < apple.length; i++) {
		System.out.println("apple " + apple[i]);
	}
	for (int i = 0; i < orange.length; i++) {
		System.out.println("orange " + orange[i]);
	}
	for (int i = 0; i < apple.length; i++) {
		if(apple[i]>=start && orange[i]<=end)
		{
			count++;
		}
	}
	for (int i = 0; i < orange.length; i++) {
		if(orange[i]>=start && orange[i]<=end)
		{
			flag++;
		}
	}
	System.out.println(count+"\n"+flag);
	s.close();
}
}
