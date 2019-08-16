import java.util.Scanner;
public class SubstringOfTwo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1=sc.nextLine();
		if(s.contains(s1)){
			System.out.println("Yes");
		}
		else{
		System.out.println("No");}
	}

}
