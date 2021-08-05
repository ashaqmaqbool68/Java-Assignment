package basics;

import java.util.Scanner;

public class Area {
	
	public static void main(String[] args) {
		int s,Area,Area1,l,b;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter one Side");
		s=input.nextInt();
		Area=s*s;
		
		System.out.println("Area of Square is:"+Area);
		System.out.println("Enter Length");
		l=input.nextInt();
		System.out.println("Enter Breadth");
		b=input.nextInt();
		Area1=l*b;
		System.out.println("Area of Rectangle is:"+Area1);
	}

}