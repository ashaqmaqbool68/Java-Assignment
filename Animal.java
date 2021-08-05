package basics;

class Vehicle{  
	  //defining a method  
	  void run(){System.out.println("Vehicle is running");}  
	}  
	//Creating a child class  
	class Animal extends Vehicle{  
	  //defining the same method as in the parent class  
	  void run(){
		 // super.run();
		  System.out.println("Bike is running safely");}  
	  
	  public static void main(String args[]){  
	  Animal obj = new Animal();//creating object  
	  obj.run();//calling method  
	  }  
	}  