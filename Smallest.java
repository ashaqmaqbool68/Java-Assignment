package basics;

import java.util.Scanner;

public class Smallest {
	public static void main(String[] args) {
	int a,b,c;	
	Scanner input=new Scanner(System.in);
	System.out.println("enter first number");
	a=input.nextInt();
	System.out.println("enter second number");
	b=input.nextInt();
	System.out.println("enter third number");
	c=input.nextInt();

	if (a<b) 
	{
		if (a<c)
		{
			System.out.println("smallest number is:"+a);
		}
	
		else {
			System.out.println("smallest number is:"+c);
		}
		}		
	else {
			if(b<c)
			{
				System.out.println("smallest number is:"+b);
			}
			else {
				System.out.println("smallest number is:"+c);
			}
		}
		
	
}
	}
