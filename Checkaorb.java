import java.util.Scanner;

public class Checkaorb {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String st=sc.next();
	int c=0;
	char[] ch=st.toCharArray();
	for(int i=0;i<st.length();i++){
		if(ch[i]=='a'|| ch[i]=='b'){
			c++;
		}
		else{
			c=0;
				break;			
}
	}
	if(c==0){
		System.out.println("no");
	}
	else{
		System.out.println("yes");
	}

	}

}
