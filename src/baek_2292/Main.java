
package baek_2292;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N =sc.nextInt();
		int temp=1;
		int result=1;
		

		while(N>temp) {
			temp+=6*result;
			result++;
		}
		System.out.println(result);
		
	}//main
}//class
