package baek_2839;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
	

		//접근을 하나 하나씩 더해가면서 접근해야된다.
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 5000;
		for(int i=0; i<=1700; i++) {
			for(int j=0; j<=1000; j++) {
				int tempNum = 3*i+5*j;
				if(tempNum==N) {
					int temp=i+j;
					result=Math.min(result, temp);
				}//end if
			}//end for
		}//end for 
		
		
		if(result==5000) {
			result=-1;
		}//end if
		
		System.out.println(result);
		
	}//main
}//class
