public class Fcs7{
public static void main(String args[]){
char c=args[0].charAt(0);
String s=Character.toString(c);
if(c>=65 && c<=90)
{
s=s.toLowerCase();
System.out.println(c+"->"+s);
}
else if(c>=97 && c<=122)
{
s=s.toUpperCase();
System.out.println(c+"->"+s);
}
}
}