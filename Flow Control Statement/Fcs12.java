public class Fcs12{
public static void main(String args[]){
int num=Integer.parseInt(args[0]);
boolean b=true;
for(int i=2;i<=num/2;i++)
{
if(num%i==0)
{
b=false;
break;
}
}
if(b==true)
{
System.out.println("Prime Number");
}
else
{
System.out.println("Not a Prime Number");
}
}
}