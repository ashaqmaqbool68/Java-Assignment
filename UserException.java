import java.util.*;
// A Class that represents use-defined expception 
class InvalidAgeException extends Exception 
{ 
    InvalidAgeException(){
        System.out.println("Age < 18");
    }
} 

class Test{
    static void status(int age) throws InvalidAgeException{
        if (age > 18) {
            System.out.println("he can vote");
        }
        else{
            throw new InvalidAgeException();
        }
    }
}
  
// A Class that uses above MyException 
public class UserException 
{ 
    // Driver Program 
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        try{
            Test.status(num);
        }
        catch(Exception ex){
            //System.out.println(ex.getMessage());
        }
    } 
} 
