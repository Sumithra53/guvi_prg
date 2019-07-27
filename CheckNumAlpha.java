import java.util.Scanner;
public class CheckNumAlpha {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in );
			String str=sc.next();
			boolean flag=false;
			for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(!Character.isDigit(c)){
				flag=true;
				break;
				//System.out.println("yes numeric");
			}
			
		}
			if(!flag)System.out.println("yes numeric");
			else System.out.println("not numeric");
			sc.close();
		}

	}

                            
