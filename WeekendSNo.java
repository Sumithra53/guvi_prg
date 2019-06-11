import java.util.Scanner;

public class WeekendSNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		if(st.contains("saturday")|| st.contains("sunday")){
			System.out.println("yes");
		}
		else if(st.contains("monday")||st.contains("tuesday")||st.contains("wednesday")||st.contains("thursday")||st.contains("friday")){
			System.out.println("no");
		}
		sc.close();
		
	}

}
