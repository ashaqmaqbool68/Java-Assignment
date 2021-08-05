package basics;

import java.util.Scanner;

public class Factor {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int n,i;
	System.out.println("Enter a number");
	n=input.nextInt();
	for(i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			System.out.println(i);
		}
	}
}
}
