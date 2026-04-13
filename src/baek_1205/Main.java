package baek_1205;


import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int score = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		int[] scoreArr = new int[N];
		int result=1;
		//만약 
		if(N!=0) {
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i<N;i++) {
				scoreArr[i]=Integer.parseInt(st.nextToken());
			}//end for
			for(int i =0; i<N;i++) {
			if(score<scoreArr[i]) {
				result++;
			}//end if
			if(N==P&&score<=scoreArr[N-1]) {
					result=-1;
					break;
				}//end if
			}//end for
		}//end if
		
		System.out.println(result);
		
	}//main
}//class
