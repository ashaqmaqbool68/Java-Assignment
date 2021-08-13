class Bank{
int getInterest(){return 0;}
}
class SBI extends Bank
{
int getInterest(){return 4;}
}
class HDFC extends Bank
{
int getInterest(){return 8;}
}
class TestBank{
public static void main(String []args){
Bank b=new SBI();
System.out.println("rate of interest is"+b.getInterest());
}}