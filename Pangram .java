import java.util.Scanner;

public class Pangram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		boolean flag=false;
		//char ch;
		for(int i=0;i<st.length();i++){
	         if ( st.charAt(i) >= 'A' && st.charAt(i) <= 'Z' ||( st.charAt(i) >= 'a' && st.charAt(i) <= 'z')) {
				flag=true;
			}
			else{
				flag=false;
			}
		}
		if(flag==true){
			System.out.println("pangram");
		}
		else{
			System.out.println("Not pangram");
		}
	}

}
