interface StackADT{
	public void push(int x);
	public int pop();
	public int peek();
}

public class StackInterface implements StackADT{
	int[] stack;
	int top = -1;
	public void push(int x){
		if(top == 10){
			System.out.println("Full");
		}
		else{
			stack[++top] = x;
		}
	}

	public int pop(){
		if(top == -1){
			System.out.println("Empty");
			return -1;
		}
		return stack[top--];

	}

	public int peek(){
		return stack[top];
	}

	public static void main(String[] args){
		StackInterface s = new StackInterface();
		s.stack = new int[10];
		s.push(10);
		s.push(11);
		s.push(12);
		s.push(13);
		System.out.println("pop =  "+s.pop());
		System.out.println("peek =  "+s.peek());
	}
}