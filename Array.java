package basics;

public class Array {
public static void main(String[] args) {
	int i;
	int[] arr= {2,3,6,9,1,5,4};
	for(i=0;i<arr.length;i++)
	{
		System.out.print("Original Array is :");
	System.out.print(arr[i]+" ");	
	}
	System.out.println();
	for(i=0;i<arr.length;i++)
	{
	if(arr[i]%2!=0)
	{
	 continue;
	}
	else
	{
		System.out.print("Array after removing odd elements is : ");
		System.out.print(arr[i]+" ");
	}
	
}}
}
