class A {
	void callme() {
		System.out.println("inside A");
	}
}

class B extends A {
	void callme() {
		System.out.println("inside B");
	}
}

class C extends A {
	void callme() {
		System.out.println("inside C");
	}
}

class DemoDMD {
	public static void main(String args []) {
		
		A r; //r is a reference variable.....
		r = new B();
		r.callme();
	}
}