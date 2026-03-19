package baek_1018;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 체스판 체우기
 * 1. 검흰 (BW or WB) 규칙적
 * 2. 맘대로 8x8로 자르기 
 * 
 * gpt가 알려줌....
 */
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int result = 65;
		String[][] ract = new String[N][M];
		
		for(int i = 0; i<ract.length; i++) {
			ract[i]=br.readLine().split("");
		}//end for 
		int s=0;
		
		//내일 생각 다시 해보기 .... 조금 헷갈린다..
		for(int y = 0; y<N-7; y++) {
			for(int x =0; x<M-7; x++) {
				int countW=0;// 바꿀수 
				int countB=0;
				for(int i =0; i<8; i++) {
					for(int j =0; j<8; j++) {
						String start = ract[y+i][x+j];
						if((i+j)%2==0) {//짝수인 경우는 시작 색이라 같아야되서 같은 색을 ++
							if(!start.equals("W")) {//start가 W가 아니면 countW 1더하기
								countW++;
							}else if(!start.equals("B")) {//start가 B가 아니면 countB 1더하기
								countB++;
							}//end else
						
						}else {//홀수인 경우 시작색과 반대라 바꿔야되서 반대 색을 ++ 
							if(!start.equals("B")) {
								countW++;
							}else if(!start.equals("W")){
								countB++;
							}//end else
						}//end else 
					}//end for 
					}//end for
				result=Math.min(result,Math.min(countW, countB));//최소값을 비교 
				}//end for
			}//end for
				System.out.println(result);
		
	}//main
}//class
