//Java multiple inheritance
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class One 
{ 
    public void print_geek() 
    { 
        System.out.println("Class One"); 
    } 
} 
  
class Two extends One 
{ 
    public void print_for() 
    { 
        System.out.println("Class Two"); 
    } 
} 
  
class Three extends Two 
{ 
    public void print_geek() 
    { 
        System.out.println("Class Three"); 
    } 
} 
  

public class InheritanceDemo 
{ 
    public static void main(String[] args) 
    { 
        Three g = new Three(); 
        g.print_geek(); 
        g.print_for(); 
        g.print_geek(); 
    } 
} 