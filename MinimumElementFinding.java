import java.util.Scanner;

public class MinimumElementFinding {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number:");
	int n=sc.nextInt();
	System.out.println("enter array elements");
	int arr[] = new int[n];
	for(int i=0;i<n;i++){
	arr[i]=sc.nextInt();
	}
	int min=arr[0];
	for(int i=0;i<n;i++){
	if(min>arr[i]){
	min=arr[i];
	}
	}
	System.out.println(min);
	sc.close();
	}
	}


