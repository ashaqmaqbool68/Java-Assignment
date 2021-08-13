//use of final in method
class Animal{
final void fun(){
System.out.println("Animal is Walking");
}
}
class Dog extends Animal{
void fun(){
System.out.println("Dog is barking");
}}
class Access1{
public static void main(String args[])
{Dog d=new Dog();
d.fun();
}
}