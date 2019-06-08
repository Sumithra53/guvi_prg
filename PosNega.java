import java.util.Scanner;

public class PosNega {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	if(i>0){
		System.out.println("postive");
	}
	else if(i<0){
		System.out.println("negative");
	}
	else{
		System.out.println("zero");
	}
}
}
