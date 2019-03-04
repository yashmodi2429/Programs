
public class Solution {
public static void main(String[] args) {
	int arr[] = {0 ,0, 1, 0, 0, 1, 0};
	System.out.println("Start Execution");
	int len = arr.length;
	int count =0;
	int start[] = new int[len];
	int i=0;
	start[i]=arr[i];
	int j =0;
	int temp = len-1;
	System.out.println("len-1 "+ temp);
	while(j<len)
	{
		//System.out.println("Test String");
		System.out.println("value of i "+i);
		if(i<len-1)
		{
		if(start[i]==arr[i+1])
		{
			System.out.println("start[i]==arr[i+1] "+start[i] +" "+ arr[i+1]);
			int num = i+2;
			System.out.println("num "+num);
			if(temp>num)
			{
			if(start[i]==arr[i+2])
			{
				System.out.println("start[i]==arr[i+2] "+start[i]+" "+arr[i+2]);
				start[i+2]=arr[i+2];
				i+=2;
				count++;
				System.out.println("Count "+count);
				System.out.println("i+=2 "+i);
			}
			else
			{
				start[i+1]=arr[i+1];
				i+=1;
				count++;
				System.out.println("Count "+count);
			}
			}
			else
			{
				start[i+1]=arr[i+1];
				i+=1;
				count++;
				System.out.println("Count "+count);
			}
			System.out.println("i+=2 "+i);
			
		}
		
		else
		{
			System.out.println("start[i]!=arr[i+1] "+start[i]+" " + arr[i+1]);
			start[i+2]=arr[i+2];
			i+=2;
			count++;
			System.out.println("i+=2 "+i);
			System.out.println("Count "+count);
		}
		}
		j++;
	}
	System.out.println("output " +count);
}
}
