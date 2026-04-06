package baek_5073;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		//삼각형이 되는 공식 제일 큰변이 나머지 두개보다 커야된다.
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb =new StringBuilder();
		
		
		while(true) {
			int[] num = new int[3];
			int sum =0;
			for(int i =0; i<3; i++) {
				num[i]=sc.nextInt();
				sum+=num[i];
			}//end for
			int max = Math.max(num[0], Math.max(num[1], num[2]));
			
			if(num[0]==0&&num[1]==0&&num[2]==0) {
				break;
			}//end if
			
			if(max>=sum-max) {
				sb.append("Invalid");
				sb.append("\n");
			}else if(num[0]==num[1]&&num[1]==num[2]) {
				sb.append("Equilateral");
				sb.append("\n");
			}else if(num[0]==num[1]||num[1]==num[2]||num[0]==num[2]) {
				sb.append("Isosceles");
				sb.append("\n");
			}else {
				sb.append("Scalene");
				sb.append("\n");
			}//end else
			
		}//end while
		System.out.println(sb);
		
	}//end main

}//class
