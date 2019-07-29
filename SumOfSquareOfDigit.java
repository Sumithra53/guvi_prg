import java.util.*;
public class SumOfSquareOfDigit {
 public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
	int sum=0,rev=0;
	int n=scan.nextInt();
	int num=scan.nextInt();
	for(int i=0;i<n;i++){
	rev=num%10;
	sum=sum+(rev*rev);
	num=num/10;
	}
	System.out.println(sum);
	scan.close();
	}
	}

