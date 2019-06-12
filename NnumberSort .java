import java.util.Arrays;
import java.util.Scanner;

public class NnumberSort {
	public static void main(String[] args) {
		System.out.println("enter number size:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=a-1;i>=0;i--){
			System.out.print(arr[i] +" ");
		}
		sc.close();
	}

}
