package basics;

import java.util.Scanner;

public class Lcm {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int i,m,n,hcf=1,lcm;
System.out.println("Enter the number");
m=input.nextInt();
System.out.println("Enter the number");
n=input.nextInt();


	for(i=1;i<=m && i<=n;i++)
		{
		if(m%i==0 && n%i==0)
         hcf=i;
		}
	 lcm=  (n*m) /hcf;
			System.out.println(lcm +" is Lcm");
			System.out.println(hcf +" is Hcf");

}
}
