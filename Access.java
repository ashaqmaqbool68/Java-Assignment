//single inheritance
class A{
int i;
int j;
void setij(int x,int y)
{
i=x;
j=y;
}}
class B extends A
{
int total;
void sum()
{
total=i+j;
}
}
class Access{
public static void main(String []args)
{
B b=new B();
b.setij(10,12);
b.sum();
}
}