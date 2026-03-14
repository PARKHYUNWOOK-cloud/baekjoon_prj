package baek_24267;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
/*		
		MenOfPassion(A[], n) {
		    sum <- 0;
		    for i <- 1 to n - 2 ===> n-2번
		        for j <- i + 1 to n - 1 ===> (n)번
		            for k <- j + 1 to n ===> (n+1)/2번
		                sum <- sum + A[i] × A[j] × A[k]; # 코드1
		    return sum;
		}
*/
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		
		System.out.println(n*(n-1)*(n-2)/6);
		System.out.println(3);
		
		
	}
}
