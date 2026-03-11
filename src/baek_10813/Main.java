package baek_10813;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st=new StringTokenizer(br.readLine());
		int N= Integer.parseInt(st.nextToken());//바구니의 갯수
		int M= Integer.parseInt(st.nextToken());//바꿀 횟수 
		int[] basket = new int[N];
		for(int x = 0 ; x<basket.length;x++) {//배열의 값 저장을 위해
			basket[x]=x+1;//0번부터 1부터 시작
		}//end for
		for(int x=0;x<M;x++) {
			st=new StringTokenizer(br.readLine());
			int i=Integer.parseInt(st.nextToken())-1;//배열은 0부터 시작
			int j=Integer.parseInt(st.nextToken())-1;//배렵을 0부터 시작
			
			//위치 바꾸기 
			int temp =basket[i];
			basket[i]=basket[j];
			basket[j]=temp;
		}//end for 
		
		for(int x=0;x<basket.length;x++) {
			System.out.print(basket[x]);
			if(x!=N-1) {
				System.out.print(" ");
			}//end if
		}//end for
		br.close();
	}//main
}//class
