package basics;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
String a,b="";
Scanner input=new Scanner(System.in);
System.out.println("Enter the string to be checked");
a=input.nextLine();
int n=a.length();
for(int i=n-1;i>=0;i--)
{
	b+=a.charAt(i);
}
if(b.equalsIgnoreCase(a))
{
	System.out.println("String is Palindrome");
}
else {
	System.out.println("String is not Palindrome");
}

	}
}