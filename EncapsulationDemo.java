class Encapsulate 
{ 
    // private variables declared  
    // these can only be accessed by  
    // public methods of class 
    private int geekRoll; 

    public int getRoll()  
    { 
       return geekRoll; 
    } 

    public void setRoll( int newRoll)  
    { 
      geekRoll = newRoll; 
    } 
} 



public class EncapsulationDemo 
{     
    public static void main (String[] args)  
    { 
        Encapsulate obj = new Encapsulate(); 
        obj.setRoll(51); 
          
        // Displaying values of the variable
        System.out.println("Geek's roll: " + obj.getRoll()); 
          
        // Direct access of geekRoll is not possible 
        // due to encapsulation 
                
    } 
} 
