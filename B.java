class Exceptiom{
public static void main(String args[]){
    int num=0;
	try{
		System.out.println(10/num);
	}
	catch(ArithmeticException e)
	{System.out.println(e);}
}}