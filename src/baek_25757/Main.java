package baek_25757;

import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		String game = st.nextToken();
		
		int result = 0;
		
		Set<String> list = new HashSet<String>();
		
		for(int i= 0 ; i<N; i++) {
			list.add(br.readLine());
		}//end for 
		
		if("Y".equals(game)) {
			result=list.size();
		}else if("F".equals(game)) {
			result=list.size()/2;
		}else if("O".equals(game)) {
			result=list.size()/3;
		}//end elseif
		
		
		System.out.println(result);
		br.close();
	}//main
}//class
