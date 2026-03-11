package baek_3052;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> resultNum = new HashSet<Integer>();
		for(int i=0;i<10;i++) {
			int inputNum= sc.nextInt();
				resultNum.add(inputNum%42);
		}//end for 
		System.out.println(resultNum.size());
	}//main
}//class
