import java.util.Scanner;

public class SumOfdigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		String s=num+"";
		int val=1;
		for(int i=0;i<s.length();i++){
			for(int j=0;j<val;j++){
				sum+=Integer.parseInt(s.charAt(j)+"");
			}
			val++;
		}
		System.out.println(sum);
	}

}
