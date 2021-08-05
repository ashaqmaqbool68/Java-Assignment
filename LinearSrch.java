package basics;
import java.util.Scanner;
public class LinearSrch {
	static int lsearch(int a[],int k)
	{
	for(int i=0;i<a.length;i++)
	{
	if(a[i]==k)
		return i;
	}
	return -1;
	}
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);	
	int i;
	int a[]= {3,6,5,7,9,0,1,8};
	System.out.println("Enter the key");
	int k=input.nextInt();
	
	int result=lsearch(a,k);
	if(result==-1)
		System.out.println("Element not found");
	else
		System.out.println("Element found at " +result+ " index");	
}
}
