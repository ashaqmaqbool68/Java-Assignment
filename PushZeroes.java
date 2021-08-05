package basics;

public class PushZeroes {
	static void pushZeroesToEnd(int arr[],int n)
	{int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
				arr[count++]=arr[i];
		}
		while(count<arr.length)
		{
			arr[count++]=0;
		}
	}
public static void main(String[] args) {
	int arr[]= {2,3,0,1,0,4,7,0,0,8};
	int i,n=arr.length;
	for(i=0;i<n;i++)
	{
		System.out.print("Array before shifting");
	}
	pushZeroesToEnd(arr,n);
	System.out.print("Array after shifting");
	for(i=0;i<n;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
}
