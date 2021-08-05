package basics;

import java.util.Scanner;

public class Average {
public static void main(String[] args) {
	int i,n,sum=0;
	Scanner input=new Scanner(System.in);
	for(i=1;i<=5;i++)
	{
		System.out.println("Enter the number");
		n=input.nextInt();
		sum+=n;
	}
	
	 int avg=sum/5;
	 System.out.println(avg);
	
}
}
