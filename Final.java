class Bike{
final void fun(){System.out.println("running with good speed");}
}
class Scooter extends Bike{
void fun(){System.out.println("running with 4000kmph speed");}
public static void main(String args[])
{
Scooter obj=new Scooter();;
obj.fun();
}
}
