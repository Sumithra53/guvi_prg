import java.util.Scanner;

public class PrimeInt {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n2=sc.nextInt();
		int count=0;
		for(int i=n;i<=n2;i++){
			count=0;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					count=1;
				
				}
			}
			if(count==0){
				System.out.print( i+" " );
			}
			
			
		}
		
	}
}
