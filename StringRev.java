package basics;

public class StringRev {
public static void main(String[] args) {
	String input="Hello World";
	
	StringBuilder s=new StringBuilder();
	s.append(input);
	s.reverse();
	System.out.println(s);
	}

}


