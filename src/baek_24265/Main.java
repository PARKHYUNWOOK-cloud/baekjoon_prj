package baek_24265;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	/*	
		MenOfPassion(A[], n) {
		    sum <- 0;
		    for i <- 1 to n - 1  ====> n-1번 
		        for j <- i + 1 to n j= (n-1)-n
		            sum <- sum + A[i] × A[j]; # 코드1
		    return sum;
		}
	*/
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
	
		
		System.out.println((n-1)*n/2);
		System.out.println(2);
	}//main
}//class
