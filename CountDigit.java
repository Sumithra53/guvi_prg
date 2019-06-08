import java.util.Scanner;

public class CountDigit {
 public static void main(String[]args){

	 int count=0;
	 Scanner scan = new Scanner(System.in);
	 System.out.println("enter the number:");
	 int n=scan.nextInt();
	 while(n%10!=0) {
	 count=count+1;
	 n=n/10;
	 }
	 System.out.println(count);
	 scan.close();
	 }

 }

