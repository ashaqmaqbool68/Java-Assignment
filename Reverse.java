package basics;

import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int re=0;
	System.out.println("Enter the number");
	int n=input.nextInt();
	while(n>0)
	{
		int r=n%10;
	    re=re*10+r;
		n/=10;
	}
	System.out.println(re+"");
}
}
