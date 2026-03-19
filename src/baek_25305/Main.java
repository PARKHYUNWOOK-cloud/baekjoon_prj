package baek_25305;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		List<Integer> examScore = new ArrayList<Integer>(); 
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			examScore.add(Integer.parseInt(st.nextToken()));
		}//end for 

		Collections.sort(examScore,Collections.reverseOrder());
		
		System.out.println(examScore.get(k-1));
		br.close();
		
		
	
	}//main

}//class
