public class Fcs5{
public static void main(String args[]){
char ch=args[0].charAt(0);
if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
{
System.out.println("Alphabets");
}
else if(ch>=46 && ch<=57)
{
System.out.println("Digits");
}
else
{
System.out.println("Special Characters");
}
}
}
