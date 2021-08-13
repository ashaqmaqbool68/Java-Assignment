class Rectangle{
int length;
int width;
void getData(int l,int w){
length=l;
width=w;
}
int rectArea()
{
return(length*width);	
}

public static void main(String[]args)
{
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();
r1.getData(4,8);
r2.getData(5,9);
int A=r1.rectArea();
System.out.println("area is="+A);
}}
	