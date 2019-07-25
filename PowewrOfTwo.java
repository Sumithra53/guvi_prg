import java.util.Scanner;
public class PowewrOfTwo {
	
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	if(num>0){
	while(num%2==0){
	num/=2;
	}
	if(num==1) System.out.println("yes");
	if(num==0 || num!=1) System.out.println("no");
	}
	scan.close();
	}
	}
