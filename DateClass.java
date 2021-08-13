import java.util.*; 
  
public class DateClass { 
    public static void main(String[] args) { 
        Date d1 = new Date(2000, 11, 21); 
        Date d2 = new Date();  // Current date 
        Date d3 = new Date(2010, 1, 3); 

        Date d4 = new Date(2323223232L); 
        System.out.println("Date represented is "+ d4 ); 

        Date d5 = new Date(2000, 11, 29, 12, 34); 
        System.out.println("Date represented is "+ d5 ); 
  
        boolean a = d3.after(d1); 
        System.out.println("Date d3 comes after date d2: " + a); 
  
        boolean b = d3.before(d2); 
        System.out.println("Date d3 comes before date d2: " + b); 
  
        int c = d1.compareTo(d2); 
        System.out.println(c); 
  
        System.out.println("Miliseconds from Jan 1 1970 to date d1 is " + d1.getTime()); 
  
        System.out.println("Before setting "+d2); 
        d2.setTime(204587433443L); 
        System.out.println("After setting "+d2); 
    } 
} 