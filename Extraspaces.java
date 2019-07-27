import java.util.Scanner;

public class Extraspaces {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String mytext = sc.nextLine();
		mytext = mytext.replaceAll("( )+", " ");
		System.out.println(mytext);
	}

}
