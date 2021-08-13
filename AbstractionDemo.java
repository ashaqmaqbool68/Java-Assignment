
// Java program to illustrate the 
// concept of Abstraction 
abstract class Shape  
{ 
    String color; 
      
    // these are abstract methods 
    abstract public void area(); 
      
    // abstract class can have constructor 
    public Shape(String color) { 
        System.out.println("Shape constructor called"); 
        this.color = color; 
    } 
      
    // this is a concrete method 
    public String getColor() { 
        return color; 
    } 
} 
class Circle extends Shape 
{ 
    double radius; 
      
    public Circle(String color,double radius) { 
  
        // calling Shape constructor 
        super(color); 
        System.out.println("Circle constructor called"); 
        this.radius = radius; 
    } 
  
    @Override
    public void area() { 
        System.out.println("Area of Circle = "+Math.PI*Math.pow(radius,2)+" color = "+super.color);
    } 
      
} 
class Rectangle extends Shape{ 
  
    double length; 
    double width; 
      
    public Rectangle(String color,double length,double width) { 
        // calling Shape constructor 
        super(color); 
        System.out.println("Rectangle constructor called"); 
        this.length = length; 
        this.width = width; 
    } 
      
    @Override
    public void area() { 
        System.out.println("Area of Rectangle = "+length*width+" color = "+super.color);
    } 
  
  
} 
public class AbstractionDemo 
{ 
    public static void main(String[] args) 
    { 
        Shape s1 = new Circle("Red", 2.2); 
        Shape s2 = new Rectangle("Yellow", 2, 4); 
          
        s1.area(); 
        s2.area(); 
    } 
} 
