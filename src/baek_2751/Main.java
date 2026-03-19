package baek_2751;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		Set<Integer> treeList = new TreeSet<Integer>();

		for(int i=0; i<N;i++) {
			treeList.add(Integer.parseInt(br.readLine()));
		}//end while
		
		List<Integer> list = new ArrayList<Integer>(treeList);
		for(int i = 0; i<list.size();i++) {
			sb.append(list.get(i)+"\n");
		}//end for
		
		System.out.println(sb);
		br.close();
		
	}//main
}//class