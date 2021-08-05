package basics;

import java.util.Iterator;
import java.util.Scanner;

public class Sum1 {
	
	public static void main(String[] args) {
		int i,n,sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		n=input.nextInt();
	     sum=n*(n+1)/2;
		System.out.println(sum);
	}

}
