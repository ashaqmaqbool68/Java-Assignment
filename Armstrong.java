	package basics;

	import java.util.Scanner;


	public class Armstrong {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
		int n,r;
		int result=0;
		
		System.out.println("Enter the number");
		n=input.nextInt();
		int temp=n;
		while(n>0)
		{
			r=n%10;
			result+= Math.pow(r,3);
			n/=10;
		}
		if(temp==result) {
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
			
	}
	}


