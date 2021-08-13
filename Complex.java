class Complex{
float real;
float img;
Complex(float r,float i)
{real=r;
img=i;
}
void display()
{
System.out.println(real+"+i"+img);
}
}
class Complex1{
public static void main(String args[]){
Complex c1=new Complex(10.2f,4.5f);
Complex c2=new Complex(6.4f,8.9f);
c1.display();
c2.display();
}
}