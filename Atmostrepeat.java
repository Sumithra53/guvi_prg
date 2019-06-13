import java.util.Scanner;

public class Atmostrepeat {
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int len = sc.nextInt();
String arr[]=new String[len];
String str1="";
int size=100;
for(int i=0;i<len;i++){
arr[i]=sc.next();
if(arr[i].length()<=size){
size=arr[i].length();
}
}
for (int i = 0; i < size; i++) {
char  t =(arr[0].charAt(i));
int check=0;
for (int j = 0; j < arr.length; j++) {
if(arr[j].charAt(i)!=t){
check=1;
}
}
if(check==0){
str1+=arr[0].charAt(i);
}
}
System.out.println(str1);
sc.close();
}

}
