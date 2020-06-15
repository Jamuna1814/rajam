public class Fcs3{
public static void main(String args[]){
if(args.length==0){
System.out.println("No vlaues");
}
else{
int i=0;
for(String a:args)
{
System.out.println(a);
if(i<args.length-1)
System.out.println(",");
i++;
}
}
}
}