import java.util.Scanner;
public class ReverseRemVowels {

	
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String str=scan.next();
	   str=str.replaceAll("[aeiouAEIOU]","");
	   System.out.println(str);
	StringBuffer sb=new StringBuffer(str);
	System.out.println(sb.reverse());
	scan.close();
	}
	}
