import java.util.Arrays;
import java.util.Scanner;
public class RepeatedNum {
          public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int arr[]=new int[n];
		 
		 int count=0;
		 for(int i=0;i<n;i++){
			 arr[i]=sc.nextInt();
		 }
		 Arrays.sort(arr);
		 for(int i=0;i<n;i++){
			 count =0;
			 for(int j=i+1;j<n;j++){
				 if(arr[i]==arr[j]){
					 count ++;
				 }
			 }
			 if(count>=1){
				 
				 System.out.println(arr[i]);
			 }
		 }
}
}
