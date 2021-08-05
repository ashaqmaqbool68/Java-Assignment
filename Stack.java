package demo.collection;

public class Stack {
	private int size;
	int topOfStack=-1;
	int[] myStackArray;
public Stack(int size) {
		this.size = size;
		myStackArray=new int[size];
	}
public void push(int i) throws Exception {
	if(topOfStack==size-1)
	{
		throw new Exception("Stack is Full");
	}
	myStackArray[++topOfStack]=i;
}
public int pop() throws Exception {
	if(topOfStack==-1)
	{
		throw new Exception("Stack is Empty");
	}
	return myStackArray[topOfStack--];
}
public int peek() throws Exception {
	if(topOfStack==-1)
	{
		throw new Exception("Stack is Empty");
	}
	return myStackArray[topOfStack];
}

public static void main(String[] args) throws Exception {
	Stack myStackOfIntegers=new Stack(10);
	
	myStackOfIntegers.push(5);
	myStackOfIntegers.push(8);
	myStackOfIntegers.push(1);
	myStackOfIntegers.push(9);
	myStackOfIntegers.pop();
	System.out.println(myStackOfIntegers.peek());
	System.out.println( myStackOfIntegers.pop());
	System.out.println( myStackOfIntegers.pop());
	System.out.println( myStackOfIntegers.pop());
	System.out.println( myStackOfIntegers.pop());
}

}
