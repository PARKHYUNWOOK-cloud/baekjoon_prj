package baek_2480;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();

		int result=0;
		if(one==two&&two==three) {
			result=10000+one*1000;
		}else if(one==two||one==three) {
			result=1000+one*100;
		}else if(two==three) {
			result=1000+two*100;
		}else {
			result= Math.max(one,Math.max(two,three))*100;
		}//end else
		System.out.println(result);
			
	}//main

}//class
