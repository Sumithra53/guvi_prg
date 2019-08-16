import java.util.Scanner;
public class MaxSumArr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int max=0;
		int sum=0;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
	    for(int i=0;i<n-1;i++){
	    	max=a[i]+a[i+1];
	    	if(max>sum){
	    		sum=max;
	    	}
	    }
	    System.out.println(max);
	}

}
