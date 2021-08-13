class Stack
{
int stk[]=new int[5];
int top=-1;
void push(int data)
{
++top;
stk[top]=data;
}
int peek()
{
return stk[top];
}
int pop() {
		stk[top]=0;
		return stk[top--];
	}
void show()
{
for (int i=0;i<5;i++)
{
System.out.println("stack elements are"+stk[i]);
}
}
}
class Stack1
{
public static void main(String args[])
{
Stack s=new Stack();
s.push(2);
s.push(4);
s.push(3);
s.push(7);
s.push(9);
s.show();
System.out.println("top of stack is:"+s.peek());
s.pop();
s.pop();
}
}