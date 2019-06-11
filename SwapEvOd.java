import java.util.Scanner;

public class SwapEvOd {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		char c[]=str.toCharArray();
		char temp;
		for(int i=0;i<c.length;i++){
			if(i%2==0){
				temp=c[i];
			c[i]=c[i+1];	
			c[i+1]=temp;
			}
		}
		for(char x:c){
			System.out.print(x);
		}
	}

}
