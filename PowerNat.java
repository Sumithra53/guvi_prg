import java.util.Scanner;

public class PowerrNat {
     public static void main(String []args){
    	 Scanner sc=new Scanner(System.in);
    	 int N=sc.nextInt();
    	 int K=sc.nextInt();
    	 int sum=(int)Math.pow(N,K);
    	 System.out.println(sum);
     }

}
