package baek_2438;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		Boolean flag = N>=1&&N<=100;
		if(flag) {
			for(int i=1; i<=N;i++) {
				for(int j=1;j<=i;j++) {
					sb.append("*");
				}//end for
				sb.append("\n");
			}//end for 
			
		}else {
			sb.append("숫자를 다시 입력해주세요!");
		}//end else
		System.out.println(sb);
		
		br.close();
	}//main
}//class
