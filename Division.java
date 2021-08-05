package basics;

import java.util.Scanner;

public class Division {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in); 
	int n;
	System.out.println("Enter the number");
	n=input.nextInt();
	if (n%2==0 & n%5==0 & n%3==0 &n%9==0)
	{
	System.out.println(n);
	}
	else {
		System.out.println("not divisible by 2,3,5,9");
	}
}


}
