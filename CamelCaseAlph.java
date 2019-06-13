public class CamelCaseAlph{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
for(String i : str.split(" ")){
String r = i.substring(0, 1);
System.out.print(r.toUpperCase() + i.substring(1).toLowerCase()+" ");
}
}
}   
