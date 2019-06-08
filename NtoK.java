import java.util.Scanner;

public class NtoK {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int sum=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<k;i++){
			sum=sum+arr[i];
		}
		System.out.println(sum);
		
	}

}
