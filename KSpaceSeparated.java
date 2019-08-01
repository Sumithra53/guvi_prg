import java.util.Scanner;

public class KSpaceSeparated {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String s=sc.next();
		System.out.println("enter k space value:");
		String t="";
		int k=sc.nextInt();
		for(int i=0;i<s.length()-1;i++){
			 t+=s.substring(i,i+k)+" ";
		}
		System.out.println(t);
	}

}
