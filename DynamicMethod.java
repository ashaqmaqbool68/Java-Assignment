
// A Java program to illustrate Dynamic Method Dispatch
class A 
{ 
    void method1() 
    { 
        System.out.println("Inside A's m1 method"); 
    } 
} 
  
class B extends A 
{ 
    // overriding m1() 
    void method1() 
    { 
        System.out.println("Inside B's m1 method"); 
    } 
} 
  
  
// Driver class 
public class DynamicMethod
{ 
    public static void main(String args[]) 
    { 
        // object of type A 
        A a = new A(); 
  
        // object of type B 
        B b = new B(); 

        A r; 
          
        // ref refers to an A object 
        r = b; 
  
        // calling A's version of m1() 
        r.method1(); 
  
        // now ref refers to a B object 
        r = a; 
  
        // calling B's version of m1() 
        r.method1(); 
    } 
} 
