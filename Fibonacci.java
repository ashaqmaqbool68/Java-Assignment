package basics;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
Scanner input=new Scanner(System.in);
int a=0,b=1,i,c=0,n;
System.out.println("Enter the number of elements");
n=input.nextInt();
System.out.println(a+"\n"+b);

for(i=2;i<=n;i++)
{
	c=a+b;
	System.out.println(""+c);

	a=b;
	b=c;
	
	}

}
}
