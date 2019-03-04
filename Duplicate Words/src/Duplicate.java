
public class Duplicate 
{
	public static void main(String[] args) 
	{
		String input="welcome to java session java session ";
		String word[]=input.split(" ");
		for(int i=0;i<word.length;i++)
		{
			for(int j=1;j<word.length;j++)
			{
				if(word[i]==word[j])
				{
					word[j]="";
				}
				
			}
		}

		for(int k=0;k<word.length;k++)
		{
			System.out.println(word[k]);
		}
	}

}
