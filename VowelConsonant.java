package basics;

import java.util.Scanner;

public class VowelConsonant {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	char ch;
	System.out.println("Enter a character");
	 ch=input.next().charAt(0);
	
	 switch(ch)
		{
		case 'a':
		System.out.println(ch+ " is a vowel");	
		break;
		case 'e':
			System.out.println(ch+ " is a vowel");	
			break;
		case 'i':
			System.out.println(ch+ " is a vowel");	
			break;
		case 'o':
			System.out.println(ch+ " is a vowel");	
			break;
		case 'u':
			System.out.println(ch+ " is a vowel");	
			break;
	   default:
			System.out.println(ch+" is a consonant");
		
	}
}
}
