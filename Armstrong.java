import java.util.Scanner;

public class Armstrong {
	 public static void main(String []args){
   	  Scanner sc=new Scanner(System.in);
   	  int n=sc.nextInt();
   	  int temp;
   	  temp=n;
   	  int c=0;
   	  while(n>0){
   		  int r=n%10;
          n=n/10;  
           c=c+(r*r*r);  
   	  }
   	  if(temp==c){
   		  System.out.println( "Armstrong");
   	  }
   	  else{
   		  System.out.println("not Armstrong");
   	  }
     }
}
