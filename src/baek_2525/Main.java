package baek_2525;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
	
		boolean totalFlag=(A>=0&&A<=23)&&(B>=0&&B<=59)&&(C>=0&&C<=1000);		
		if(totalFlag) {
			A=(A+(B+C)/60)%24;
			B=(B+C)%60;
			System.out.println(A+" "+B);
		}else {
			System.out.println("다시 입력해주세요!");
			
		}//end else
		
	}//main
}//class
