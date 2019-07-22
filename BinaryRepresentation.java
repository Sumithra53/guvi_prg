import java.util.Scanner;

public class BinaryRepresentation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String num=sc.next();
		int c=0;
		char a[]=num.toCharArray();
		for(int i=0;i<num.length();i++){
			if(a[i]=='0' || a[i]=='1'){
				//System.out.println("Yes");
				c++;
			}
		}
		if(num.length()==c)System.out.println("yes");
		else System.out.println("no");
		sc.close();
	}

}
