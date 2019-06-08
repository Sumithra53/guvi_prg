import java.util.Scanner;
public class VowCon {
	
	
	public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	char ch=scan.next().charAt(0);
	if(Character.isAlphabetic(ch)){
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
	System.out.println("Vowel");
	}
	else {
	System.out.println("Consonant");
	}}
	else
	{
	System.out.println("invalid");
	}
	}
	}

