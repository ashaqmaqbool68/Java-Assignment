//constructor overloading
class Test{
int length;
int width;
void Test()
{}
void Test(int l,int w)
{
length=l;
width=w;
}
void Area()
{
int Area=length*width;
System.out.println("area is "+Area);
}
}
class TestDemo1
{
public static void main(String args[])
{
Test t=new Test();
t.Test();
t.Test(3,6);
t.Area();
}
}