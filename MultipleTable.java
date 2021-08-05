package basics;

import java.util.Scanner;

public class MultipleTable {
public static void main(String[] args) {Scanner input=new Scanner(System.in);
	
int i,j,n;
System.out.println("enter the number");
	n=input.nextInt();
	
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=10;j++)
		{
			int t=i*j;
			System.out.println(t);
		}
		
	}
}
}
