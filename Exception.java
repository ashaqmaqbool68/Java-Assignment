class Exception{
public static void main(String args[]){
    int num=10/0;;
	try{
		System.out.println(num);
	}
	catch(ArithmeticException e)
	{System.out.println(e);}
}}