package baek_24266;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
/*
		MenOfPassion(A[], n) {
		    sum <- 0;
		    for i <- 1 to n ==> n번
		        for j <- 1 to n ==> n번
		            for k <- 1 to n ==> n번
		                sum <- sum + A[i] × A[j] × A[k]; # 코드1
		    return sum;
		}
*/		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		System.out.println(n*n*n);
		System.out.println(3);
	}

}
