public class TryCatch{
	public static void main(String args[])
	{try{
		int a=50/0;
		System.out.println(a);
        System.out.println("hello world");
	}
	catch(ArithmeticException e)
		{
		System.out.println(e);
		}
	}}