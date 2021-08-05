package basics;

public class Pattern1 {
public static void main(String[] args) {
	int i,j,n=5;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	System.out.println();
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(i);
		}
		System.out.println();
	}
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print(i);
		}
		System.out.println();
	}
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(n+1-i);
		}
		System.out.println();
	}
	
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	
	for(i=1;i<=9;i++)
	{
		if (i<=5)
	{
		for(j=1;j<=5-i;j++)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
	}
	else
	{
		for(j=6;j<=i;j++)
		{
			System.out.print(" ");
		}
		for(j=1;j<=9-i+1;j++)
		{
			System.out.print("* ");
		}	
	}
		System.out.println();
	}
}
}
