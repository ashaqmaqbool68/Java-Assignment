package basics;

public class Area {
	int length,breadth,height;
	Area(int l,int b)
	{
		length=l;
		breadth=b;
	}
	Area(int l,int b,int h)
	{
		length=l;
		breadth=b;
		height=h;
	}
	Area(Area p)
	{
		length=p.length;
		breadth=p.breadth;
		height=p.height;
	}
 int volume()
{
	return length*breadth*height;
}
public static void main(String[] args) {
	Area a=new Area(4,5,2);
	Area t=new Area(a);
	int A=a.volume();
	int B=t.volume();
	System.out.println(A);
	System.out.println(B);
}
}
