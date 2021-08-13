
// Java program to demonstrate multiple inheritance  
// in interfaces 
import java.io.*; 
interface InterfaceA 
{ 
    void geekName(); 
} 
  
interface InterfaceB
{ 
    void geekInstitute(); 
} 
  
interface InterfaceC extends InterfaceA, InterfaceB  
{ 
    void geekBranch(); 
} 
  
// class implements both interfaces and provides 
// implementation to the method. 
public class InterfaceDemo implements InterfaceC 
{ 
    public void geekName() 
    { 
        System.out.println("ASHIQ"); 
    } 
  
    public void geekInstitute() 
    { 
        System.out.println("NIT Srinagar"); 
    } 
  
    public void geekBranch() 
    { 
        System.out.println("IT"); 
    } 
      
    public static void main (String[] args) 
    { 
        InterfaceDemo ob1 = new InterfaceDemo(); 
  
        // calling the method implemented 
        // within the class. 
        ob1.geekName(); 
        ob1.geekInstitute(); 
        ob1.geekBranch(); 
    } 
} 
