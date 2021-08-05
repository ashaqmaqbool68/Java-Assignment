package basics;

public class Lower {
	char i;
	void uppercaseAlphabets()
	{
	for(i=65;i<=90;i++)
	{
		System.out.println(i);
	}
	}
	void lowercaseAlphabets()
	{
	for(i=97;i<=122;i++)
	{
		System.out.println(i);
	
	}
	}
	public static void main(String[] args) {
		
		
		
		Lower lu=new Lower();
		System.out.println("Upper Case Alphabets");
		lu.uppercaseAlphabets();
		System.out.println("Lower Case Alphabets");
		lu.lowercaseAlphabets();
		
	}
}
