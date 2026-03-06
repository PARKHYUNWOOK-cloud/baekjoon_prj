package baek_2753;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int year = sc.nextInt();
		boolean flag= year%4==0&&(year%100!=0||year%400==0);
		int flagNum= 0;
		if(flag) {
			flagNum=1;
		}//end if 
		System.out.println(flagNum);

	}//main
}//class
