package basics;

public class Outer {
private String str ="ashaq";
class Inner{
	void draw() {
		System.out.println(str);
	}
}

public String getStr() {
	return str;
}

public void setStr(String str) {
	this.str = str;
}
public static void main(String[] args) {
	Outer o=new Outer();
	Outer.Inner i=o.new Inner();
	i.draw();
}
}

