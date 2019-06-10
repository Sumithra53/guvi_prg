import java.util.Scanner;

public class MultiplesN {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s;
		for(int i=1;i<=5;i++){
			s=i*n;
			System.out.print(s+ " ");
		}
		  sc.close();
	}
      
}
