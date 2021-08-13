class Switch{
	public static void main(String []args)
	{
		int a=6,b=2;
		int c=3;
		System.out.println("enter first number"+a);
		System.out.println("enter second number"+b);
		//System.out.println("enter the value 0 for add,1 for sub,2 for mul,3 for div,4 for mod"+c);
	switch (c)
		{ 
		case 0:c=a+b;break;
		case 1:c=a-b;break;
		case 2:c=a*b;break;
		case 3:c=a/b;break;
		case 4:c=a%b;break;
		default:System.out.println("wrong choice");
		}
		System.out.println("result is"+c);
}

}