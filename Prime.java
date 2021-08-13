class Prime{
static void checkPrime(int n)
{

int m=n/2,flag=1;
if(n==0||n==1)
{
System.out.println(n+ "is not prime");
}
else{
for(int i=2;i<=m;i++)
{
if(n%i==0)
{
System.out.println(n+ " is not prime");
flag=0;
break;
}
}
if(flag==1)
{
System.out.println(n+ " is Prime");
}}}
public static void main(String args[])
{
checkPrime(2);
checkPrime(9);
checkPrime(7);
checkPrime(20);
}
}
