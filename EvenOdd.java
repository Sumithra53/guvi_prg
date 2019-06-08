import java.util.Scanner;
public class EvenOdd {

	
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	int a=scan.nextInt();
	if(a>0){
	if(a%2==0){
	System.out.println("Even");
	}
	else{
	System.out.println("Odd");
	}}
	else{
	System.out.println("invalid");
	}
	}

	}


