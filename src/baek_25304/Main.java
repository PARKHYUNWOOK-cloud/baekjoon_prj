package baek_25304;

import java.util.Scanner;

/**
 * 25304번 for - 영수증 
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x=sc.nextInt();
		int n=sc.nextInt();
		int total=0;
		for(int i =0; i<n; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			total+=a*b;
		}//end for
		String result=x==total?"Yes":"No";
		System.out.println(result);
		
		
		
		
		
		
	}//main

}//class
