package baek_2562;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int[] num=new int[9];
		for(int i =0; i<9;i++) {
			num[i]=sc.nextInt();
			
		}//end for
		
		int maxValue=num[0];
		int maxNumber=1;
		for(int i=1;i<num.length;i++) {
			if(maxValue<num[i]) {
				maxValue=num[i];
				maxNumber=i+1;
			}//end if
		}//end for 
		System.out.println(maxValue);
		System.out.println(maxNumber);
		
	}//main
}//class
