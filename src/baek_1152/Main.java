package baek_1152;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] text=br.readLine().split(" ");
		int cnt =0;
		for(String t : text) {
			if(!t.equals("")) {
				cnt++;
			}
		}
		System.out.println(cnt);
		br.close();
	}//main
}//class
