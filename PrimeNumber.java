package basics;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int i,num,prime=1;
		System.out.println("Enter a number");
		num=input.nextInt();
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				prime=0;
			}
		}
		if(prime==1)
		{
			System.out.println(num+" is Prime Number:");
		}
		else {
			System.out.println(num+" is Not a Prime Number:");
		}
	}

}
