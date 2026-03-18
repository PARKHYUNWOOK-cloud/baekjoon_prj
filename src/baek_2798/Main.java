package baek_2798;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st= new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());//카드의 개수
		int M = Integer.parseInt(st.nextToken());//범위 지정 수 
		
		st=new StringTokenizer(br.readLine());
		int[] cardNum = new int[N];//배열을 카드의 N개로
		
		for(int i=0; i<cardNum.length; i++) {
			cardNum[i]=Integer.parseInt(st.nextToken());
		}//end for
		
		List<Integer> sumList = new ArrayList<Integer>();
		for(int i = 0; i<cardNum.length;i++) {
			for(int j = i+1; j<cardNum.length; j++) { //i~ n 
				for(int k = j+1; k<cardNum.length; k++) {
					int sum = cardNum[i]+cardNum[j]+cardNum[k];
					if(sum<=M) {
						sumList.add(cardNum[i]+cardNum[j]+cardNum[k]);
					}//end if 
				}//end for
			}//end for
		}//end for 
		
		Collections.sort(sumList,Collections.reverseOrder());
		
		System.out.println(sumList.get(0));
		
		br.close();
	}//main
}//class
