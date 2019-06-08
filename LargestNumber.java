import java.util.Scanner;
public class LargestNumber {
      public static void main(String args[]){
        	Scanner scan=new Scanner(System.in);
        	int a,b,c;
        	a=scan.nextInt();
        	b=scan.nextInt();
        	c=scan.nextInt();
        	if(a>b && a>c){
        	System.out.println(a);
        	}
        	else if(b>c){
        	System.out.println(b);
        	}
        	else{
        	System.out.println(c);
        	}


        	}
        	

        }
