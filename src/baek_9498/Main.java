package baek_9498;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int score = sc.nextInt();
		String msg = "F";
		if(score <101 && score>=90) {
			msg="A";
		}else if(score>=80) {
			msg="B";
		}else if(score>=70) {
			msg="C";
		}else if(score>=60) {
			msg="D";
		}//end elseif
		
		System.out.println(msg);

	}//main
}//class
