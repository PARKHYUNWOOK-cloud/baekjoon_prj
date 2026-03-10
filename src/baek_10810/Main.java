package baek_10810;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());//바구니의 총 개수 
		int M=Integer.parseInt(st.nextToken());//넣기 위한 시도 횟수
		int[] num = new int[N]; //초기값을 다 0으로 저장되어있다.
		
		for(int c=0; c<M;c++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken())-1;
			int j = Integer.parseInt(st.nextToken())-1;
			int k= Integer.parseInt(st.nextToken());
			for(int v=i;v<=j;v++) {
				num[v]=k;
			}//end for
		}//end for
		
		for(int i=0; i<num.length;i++) {
			System.out.print(num[i]);
			if(i!=num.length-1) {
				System.out.print(" ");
			}//end if
		}//end for
		br.close();
		
	}//main
}//class
