package basics;

import java.util.Scanner;

public class Fibonacci {
	static int fibonacci(int c)
	{
		if(c==0)
		{
			return 0;
		}
		else if(c==1)
		{
			return 1;
		}
		else
		{
			return fibonacci(c-1)+fibonacci(c-2);
		}
	}
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int i,c=0;
	System.out.println("Enter the number of elements in Series");
	 int n=input.nextInt();
	for(i=0;i<n;i++)
		{
		System.out.print( fibonacci(c)+"  "); 
		c++;
		}
}
}
