import java.util.Scanner;

public class StringDifferOneChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int count=0;
		for(int i=0;i<s1.length();i++){
			for(int j=0;j<s2.length();j++){
				if(i==j){
					if(s1.charAt(i)!=s2.charAt(i)){
					count++;
				}
				}
				
			}
		}
		if(count==1){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
		
		
	}

}
