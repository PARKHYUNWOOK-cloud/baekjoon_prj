package baek_14681;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();		
		
		int quadrant =4;
		if(num1>0&&num2>0) {
			quadrant=1;
		}else if(num1<0&&num2>0) {
			quadrant=2;
		}else if(num1<0&&num2<0) {
			quadrant=3;
		}//end elseif
	
		System.out.println(quadrant);
		
		
	}//main
}//class
