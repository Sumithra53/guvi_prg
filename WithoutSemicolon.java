import java.util.Scanner;

public class WithoutSemicolon {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.next();
		for(int i=1;i<2;System.out.println(str)){
		i++;
		}
		sc.close();
	}

}
