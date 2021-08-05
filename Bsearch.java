package basics;

import java.util.Scanner;

public class Bsearch {
	static int bsearch(int a[],int k)
	{ int l=0,r=a.length-1;
		while(l<=r)
		{
			int m=l+(r-1)/2;
			if(k==a[m])
				return m;
			if(k<a[m])
				r=m-1;
			else
				l=m+1;
		}	

	return -1;

	}
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int a[]= {1,2,3,5,6,7,8,11};
	System.out.println("Enter the key");
	int k=input.nextInt();
	
	
	int result1=bsearch(a,k);
	if(result1 == -1)
		System.out.println("Element not found");
	else
		System.out.println("Element found at " +result1+ " index");
		
	
}
}
