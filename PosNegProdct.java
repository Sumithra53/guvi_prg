import java.util.Scanner;

public class PosNegProdct {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int n=sc.nextInt();
		System.out.println("enter array elements:");
		int[]arr=new int[n];
		int sum = 1;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			sum=sum*arr[i];
		}
		System.out.println("product is:"+sum);
		sc.close();
	}
}
