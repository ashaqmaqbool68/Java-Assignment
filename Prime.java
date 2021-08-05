package basics;

public class Prime {
public static void main(String[] args) {
	int i,j;
	int t=1,s,flag=1;
	System.out.println(t);
	for(i=2;i<=100;i++)
	{
		for(j=2;j<i;j++)
		{ s=i%j;
			if(s==0);
			{
				flag=0;
				System.out.println(i+"is not prime");
			}
			else{
				
				System.out.println(i+"is prime");
		}}
	
	}
}
}
