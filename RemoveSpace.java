import java.util.Scanner;

public class RemoveSpace {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		st=st.replaceAll(" ","");
		System.out.println(st);
	}

}
