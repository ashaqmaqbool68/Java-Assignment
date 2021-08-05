package basics;

import java.util.Scanner;

public class AvgArray {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int[]arr= {5,6,7,3,9};
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		sum+=arr[i];
		
	}
	int avg=sum/arr.length;
	System.out.println("Average of Array Elements is:"+avg);
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
			{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
			}}
			System.out.println("Min number in an Array is:"+arr[0]);
		
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
					
					}}
					System.out.println("Max number in an Array is:"+arr[0]);
}
}
