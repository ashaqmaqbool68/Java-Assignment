class Person 
{ 
    int age = 60;
    void message() 
    { 
        System.out.println("A Person"); 
    } 
} 
  
/* Subclass Student */
class Student extends Person 
{ 
    int age = 25;
    void message() 
    { 
        System.out.println("A Student can be "+super.age+" years old"); 
        super.message();
    } 
} 
  
/* Driver program to test */
public class SuperTest1 
{ 
    public static void main(String args[]) 
    { 
        Student s = new Student(); 
  
        // calling display() of Student 
        s.message(); 
    } 
} 