package demo.collection;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	Stack myStackOfIntegers=new Stack();
	myStackOfIntegers.push(3);
	myStackOfIntegers.push(5);
	myStackOfIntegers.push(8);
	myStackOfIntegers.push(1);
	myStackOfIntegers.pop();
	System.out.println(myStackOfIntegers.peek());
	myStackOfIntegers.pop();
	myStackOfIntegers.pop();
	
}
}
