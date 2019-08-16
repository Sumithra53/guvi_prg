import java.util.Scanner;
public class OneRightanglePattrn {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int val=1;
		for(int i=1;i<=n;i++){
			for(int j=n;j>=i;j--){
				if(i>j){
			System.out.print(val);}
				else{
					System.out.print(val+" ");
				}
			}
			System.out.println();
			}
		
	}

}
