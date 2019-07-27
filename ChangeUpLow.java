
import java.util.Scanner;

public class ChangeUpLow {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String res="";
		String t="";
				for (int i = 0; i < str.length(); i++) {
			        if(Character.isUpperCase(str.charAt(i))){
			        	res+=(str.substring(i,i+1)).toLowerCase();
			        }
			        else{
			        	res+=str.substring(i,i+1).toUpperCase();
			        }
				}
				System.out.println(res);
	}

}
