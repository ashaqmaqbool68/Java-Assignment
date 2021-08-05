package basics;

import java.util.Scanner;

public class Pattern {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int i,j,n;
	System.out.println("Enter the value of n");
	n=input.nextInt();
	System.out.println("\n");
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(j);
		
		}
		System.out.println();
	}
}	
}