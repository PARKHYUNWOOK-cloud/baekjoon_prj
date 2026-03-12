package baek_2675;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T =Integer.parseInt(br.readLine());
		for(int i=0; i<T;i++) {
			st=new StringTokenizer(br.readLine());
			int cnt = Integer.parseInt(st.nextToken());
			String[] text =st.nextToken().split("");
	
			for(int j=0;j<text.length;j++) {
				for(int k = 0; k<cnt;k++) {
					sb.append(text[j]);
				}//end for
			}//end for 
			sb.append("\n");
		}//end for 
		System.out.println(sb);
		
		br.close();
	}//main
}//class
