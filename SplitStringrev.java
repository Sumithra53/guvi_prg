import java.util.Scanner;
public class SplitStringrev {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		String rev="";
		for(String s:st.split(" ")){
			StringBuilder sb=new StringBuilder(s);
			System.out.print(sb.reverse()+" ");
		}
	}

}
