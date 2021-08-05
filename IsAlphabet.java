package basics;

import java.util.Scanner;

public class IsAlphabet {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	char ch;
	System.out.println("Enter a character");
	 ch=input.next().charAt(0);
	if ((ch>='a'&& ch<='z')||( ch>='A'&&ch<='Z'))
	{
		System.out.println(ch +" is Alphabet");
	}
	else {
		System.out.println(ch +" is not Alphabet");
	}
}
}
