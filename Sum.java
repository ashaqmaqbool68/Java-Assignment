package basics;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int i,n,sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		n=input.nextInt();
		for(i=1;i<=n;i++)
		{
			 sum=sum+i;
		}
	
		System.out.println(sum);
	}

}