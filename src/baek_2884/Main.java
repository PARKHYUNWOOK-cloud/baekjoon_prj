package baek_2884;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);
	
	int H=sc.nextInt();
	int M=sc.nextInt();
	
	boolean totalFlag=(H>=0&&H<=23)&&(M>=0&&M<=59);
	M-=45;
	if(totalFlag) {
		if(M<0) {
			H=H==0?23:--H;
			M+=60;
		}//end if
	}else {
		System.out.println("알람을 다시 입력해주세요");
	}//end else
	System.out.println(H+" "+M);
	}//main	

}//class
