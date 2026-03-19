package baek_2750;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Set<Integer> hashList = new HashSet<Integer>();

		for(int i=0; i<N;i++) {
			String num = br.readLine();
			hashList.add(Integer.parseInt(num));
		}//end while
		
		List<Integer> list = new ArrayList<Integer>(hashList);
		
		Collections.sort(list);
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}//end for
		
	}//main
}//class
