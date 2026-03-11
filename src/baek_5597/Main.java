package baek_5597;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean[] homeWork=new boolean[30];
		
		for(int i=0;i<28;i++) {//0 ~ 27번 총 28번
			int student = sc.nextInt();
			homeWork[student-1]=true;//완료한 얘들은 true
		}//end for
		for(int i=0;i<homeWork.length;i++) {//범인 섹출
			if(!homeWork[i]) {
				System.out.println(i+1);
			}//end if
		}//end for 
	}//main
}//class
