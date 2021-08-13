class Test{
int length;
int width;
void Test(int l,int w){
length=l;
width=w;}
int Area(){
System.out.println("area is="+(l*w));
}}
class TestDemo{
public static void main(String args[])
{Test t=new Test();
t.Test(4,6);
int t1=t.Area();

}
}