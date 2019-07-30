import java.util.Scanner;

public class MultiplicationStr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string1:");
		String s1=sc.next();
		System.out.println("enter string2:");
		String s2=sc.next();
		int m1=Integer.parseInt(s1);
		int m2=Integer.parseInt(s2);
		int mul=m1*m2;
		String s=String.valueOf(mul);
		System.out.println(s);
		sc.close();
	}

}
