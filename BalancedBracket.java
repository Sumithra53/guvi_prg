import java.util.Scanner;

public class BalancedBracket {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		int a=0,b=0;
		for(int i=0;i<st.length();i++){
			if(st.substring(i).equals(("("))){
				a++;
			}
			if(st.substring(i).equals((")"))){
				b++;
			}
		}
		if(a==b){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}

}
