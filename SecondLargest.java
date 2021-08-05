package basics;

import java.util.Scanner;

public class SecondLargest {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int[]arr= {5,18,17,3,27};
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+"  ");
		
	}
	System.out.println();
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
					{
					if(arr[i]<arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
					
					}
				}
					System.out.println("Second Largest number in an Array is:"+arr[1]);
					System.out.println("Third Largest number in an Array is:"+arr[2]);
}
}
