package baek_10950;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int[] result = new int[T];
		
		for(int i= 0;i<T;i++) {
			int A=sc.nextInt();
			int B=sc.nextInt();
			result[i]=A+B;
		}//end for
		
		for(int i=0;i<T;i++) {
			System.out.println(result[i]);
		}//end for
		
	}//main
}//class
