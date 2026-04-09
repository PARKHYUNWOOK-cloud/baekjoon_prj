package baek_11723;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws Exception {
		
		List<Integer> list = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb = new StringBuilder();
		StringTokenizer st ;
		
		int M = Integer.parseInt(br.readLine());
		for(int i = 0; i<M; i++) {
			st=new StringTokenizer(br.readLine());
			
			String name =st.nextToken();
			int number=0;
			if(st.hasMoreTokens()) {
				number = Integer.parseInt(st.nextToken());
				
			}//end if 
			
			if("add".equals(name)&&!list.contains(number)) {
				list.add(number);
			}//end if
			
			if("remove".equals(name)&&list.contains(number)) {
				list.remove(list.indexOf(number));
			}//end if
			
			if("check".equals(name)) {
				String temp="1\n";
				if(!list.contains(number)) {
					temp="0\n";
				}//end if
				sb.append(temp);
			}//end if
			
			if("toggle".equals(name)) {
				if(list.contains(number)) {
					list.remove(list.indexOf(number));
				}else {
					list.add(number);
				}//end else
			}//end if
			
			if("all".equals(name)) {
				list.clear();
				for(int j = 1; j<21; j++) {
					list.add(j);
				}//end for
			}//end if
			
			if("empty".equals(name)) {
				list.clear();
			}//end if
			
		}//end for 
		
		System.out.println(sb);
		
		br.close();
		
		
		
		
		
	}//main
}//class
