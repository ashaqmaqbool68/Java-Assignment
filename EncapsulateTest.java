package demo.encapsulation;

public class EncapsulateTest {
	private static int id;
	private static String name;
public static void main(String[] args) {
	
	EncapsulateTest t =new EncapsulateTest(id, name);
	EncapsulateTest.id=5;
	EncapsulateTest.name="Haroon";
	System.out.println(id +"  "+name);
	
}
public EncapsulateTest(int id, String name) {
	
	this.id = id;
	this.name = name;
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
