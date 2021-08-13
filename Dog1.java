class Dog1{  
 private void eat(){System.out.println("dog1 is eating...");}
}
class Dog2 extends Dog1{
void eat(){System.out.println("dog2 is eating...");}
  }
 class DOgDemo{
public static void main(String args[]){  
  Dog1 d1=new Dog1();  
  d1.eat();  
 }  
}  