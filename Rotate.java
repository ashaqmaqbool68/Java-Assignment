package basics;

public class Rotate {
public static void main(String[] args) {
	int arr[]= new int[]{1,2,4,6,9};
	int i,j,k,n=2;
	System.out.println("Original Array is:");
	for(i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+"  ");
	}
	System.out.println();
	for(i=0;i<n;i++)
	{
		int first=arr[0];
		for(j=0;j<arr.length-1;j++)
		{
			arr[j]=arr[j+1];
		}
		arr[j]=first;
	}
	System.out.println("Array Formed After Rotation is:");
	for(i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+"  ");
	}
}
}