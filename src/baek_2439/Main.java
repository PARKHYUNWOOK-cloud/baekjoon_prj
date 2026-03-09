package baek_2439;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		boolean flag = N>=1 && N<=100;
		if(flag) {
			for(int i=1;i<=N;i++) {
				for(int k=0;k<N-i;k++) {
					sb.append(" ");
				}//end for
				for(int j=0; j<i;j++) {
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
