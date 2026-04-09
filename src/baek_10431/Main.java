package baek_10431;

import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st ;
		
		int P = Integer.parseInt(br.readLine());
		for(int i = 0; i<P; i++) {
			int cnt=0;
			int[] student = new int[20];
			st = new StringTokenizer(br.readLine());
			sb.append(st.nextToken()+" ");
			for(int j = 0; j<20; j++) {
				student[j]=Integer.parseInt(st.nextToken());
			}//end for 
			
			for(int k=0;k<20;k++) {
				for(int t=0; t<k; t++) {
					if(student[t]>student[k]) {
						cnt++;
					}
				}
			}//end for 
			sb.append(cnt+"\n");
		}//end for
		
		System.out.println(sb);
		br.close();
		
	}//main
}//class
