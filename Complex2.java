//complex no.manipulation
class Complex{
float real;
float img;
Complex(float r,float i)   
{real=r;
img=i;
}
Complex()
{}
Complex add(Complex c1,Complex c2)
{
Complex c=new Complex();
c.real=c1.real+c2.real;
c.img=c1.img+c2.img;
return c;
}
Complex sub(Complex c1,Complex c2)
{
Complex c=new Complex();
c.real=c1.real-c2.real;
c.img=c1.img-c2.img;
return c;
}
void show()
{

System.out.println(real+"-i"+img);
}
void display()
{

System.out.println(real+"+i"+img);
}
}
class Complex2{
public static void main(String args[]){
Complex c1=new Complex(10.2f,4.5f);
Complex c2=new Complex(6.4f,2.9f);
Complex c3=new Complex();
c3=c3.add(c1,c2);
c1.display();
c2.display();
c3.display();
c3=c3.sub(c1,c2);
c3.show();

}
}