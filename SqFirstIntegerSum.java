import java.util.Scanner;

public class SqFirstIntegerSum {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n=sc.nextInt();
		int r;
		int sum=0;
		while(n!=0){
			
			r=n%10;
			sum=sum+(r*r);
			n=n/10;
			}
		System.out.println(sum);
	}

}
