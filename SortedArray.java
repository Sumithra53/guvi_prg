import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int a[]=new int[n1];
		for(int i=0;i<n1;i++){
			a[i]=sc.nextInt();
				}
				Arrays.sort(a);
				for(int i=0;i<n1;i++){
					System.out.print(a[i]+" ");
				}
				
		sc.close();
	}

}
