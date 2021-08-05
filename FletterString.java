package basics;

public class FletterString {
	static String firstLetterWord(String str)
	{ boolean v=true;
	String result=" ";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				 v=true;
			}
			else if(str.charAt(i)!=' ' && v==true)
			{
				 result+=(str.charAt(i)+" ");
				 v=false;
				
			}
		}
		return result;
	}
public static void main(String[] args) {
	String str="Good Morning Teachers";
	System.out.println(firstLetterWord(str));
	
}
}
