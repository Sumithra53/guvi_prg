import java.util.*;
public class SquareofDigit {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++){
	a[i]=scan.nextInt();
	}
	int s=n;
	int sum=0;
	for(int i=0;i<a.length;i++){
	sum+=(int)Math.pow(a[i],s);
	}
	System.out.println(sum);
	scan.close();
	}
	}
