package basics;

import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
    System.out.println("enter number");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
        int i,j;
        for(i=2;i<=n;i++)
        {
        	int ct=0;
        	for(j=1;j<=i;j++)
        	{
            if (i%j==0)
            
             ct++;
          
        }
        
             if(ct==2)
         {
             System.out.println(i+" ");
         }
    }}
}
