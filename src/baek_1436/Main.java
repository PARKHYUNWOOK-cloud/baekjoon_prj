package baek_1436;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		//연속으로 666이 포함되는경우 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		if(N<0) {
			N=0;
		}
		int cnt =0;
		for(int i = 666; i<10000000; i++) {
			String s = String.valueOf(i);
			if(s.contains("666")) {
				cnt++;
				if(N==cnt) {
					System.out.println(s);
					break;
				}//end if
			}//end if
		}//end for
		
		br.close();
		
		
	}//main
}//class
