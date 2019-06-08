import java.util.Scanner;

public class LeapYear {
 public static void main(String[]args){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the year:");
	 int yr=sc.nextInt();
	 if(yr%4==0){
		 System.out.println("LeapYear");
	 }
	 else{
		 System.out.println("NonLeapYear");
	 }
 }
}
