
public class Reverse {
public static void main(String[] args) {
	
	String in="welcome to java";
	
	String result="";
	int len=in.length();
	String a[]=new String[len];
	//System.out.println(len);
	String temp[]=in.split(" ");
	for(int i=0;i<len;i++)
	{
		result=result+a[len-1];
	}
	System.out.println(result);
}
}