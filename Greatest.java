package basics;
import java.util.Scanner;
public class Greatest {
	public static void main(String[] args) {
		int a,b,c;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number");
		a=input.nextInt();
		System.out.println("Enter a number");
		b=input.nextInt();
		System.out.println("Enter a number");
		c=input.nextInt();
		
   if(a>b)
   {
	   if(a>c) {
		   System.out.println("%d is greatest"+a);
	   }
	   else{
		   System.out.println("%d is greatest"+c);
	   }
   }
   else {
	   if(b>c) {
		   System.out.println("%dis greatest"+b);
	   }
	   else {
		  System.out.println("%d is greatest"+c); 
	   }
   }
	}
}

