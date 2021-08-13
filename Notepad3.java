class Test{
int length;
int width;
int Test(int l,int w){
l=4;
w=6;}
int getArea(){
return(l*w);
}}
class testDemo{
public static void main(String args[])
{Test t=new Test(int l,int w);
t.Test(4,6);
int t1=t.getData();
System.out.println("area is="+t1);
}
}