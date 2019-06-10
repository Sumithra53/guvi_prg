import java.util.Scanner;

public class ArmstrongInterval {
	 public static void main(String []args){
	   	  Scanner sc=new Scanner(System.in);
	   	  int n=sc.nextInt();
		int n2=sc.nextInt();
	   	  int temp;
	   	  
	   	  int r=0;
	   	  int c=0;
	   	  for(int i=n;i<n2;i++){
				temp=i;
				c=0;
	   	  while(temp!=0){
	   		  r=temp%10;
	   		  
	          temp=temp/10;  
	           c=c+(r*r*r);  
	   	  }
	   	  if(i==c){
	   		  System.out.println( c +" ");
	   	  }
	   	 
	     }
	   	  }
	 }


