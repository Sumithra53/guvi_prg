import java.util.Scanner;

public class Palindrome {
      public static void main(String []args){
    	  Scanner sc=new Scanner(System.in);
    	  int n=sc.nextInt();
    	  int sum=0;
    	  int temp;
    	  temp=n;
    	  while(n>0){
    		  int r=n%10;
    		   sum=sum*10+r;
    		  n=n/10;
    	  }
    	  if(temp==sum){
    		  System.out.println( "palindrome");
    	  }
    	  else{
    		  System.out.println("not palindrome");
    	  }
      }
}
