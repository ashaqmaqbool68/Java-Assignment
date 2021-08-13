//use of SUPER keyword
class Animal{
Animal(){
System.out.println("Animal is walking");
}
class Dog extends Animal{
Dog(){
super();
System.out.println("Dog is barking");
}
public static void main(String args[]){
Dog d=new Dog();
}
}