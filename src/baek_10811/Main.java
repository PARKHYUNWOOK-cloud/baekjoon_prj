package baek_10811;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		
		st = new StringTokenizer(br.readLine());
		int N= Integer.parseInt(st.nextToken());
		int M= Integer.parseInt(st.nextToken());
		int[] basket = new int[N];
		
		for(int x =0; x<N;x++) {
			basket[x]=x+1;
		}//end for 
		
		
		for(int x=0; x<M; x++) {
			st=new StringTokenizer(br.readLine());
			int i=Integer.parseInt(st.nextToken())-1;
			int j=Integer.parseInt(st.nextToken())-1;
			int index=i;
			int[] temp = basket.clone();
			for(int k=j;k>=i;k--) {
				basket[index]=temp[k];
				index++;
			}//end for
		}//end for
		for(int i=0;i<basket.length;i++) {
			System.out.print(basket[i]);
			if(i!=N) {
				System.out.print(" ");
			}//end if
		}//end for 
				
		
	}//main
}//class
