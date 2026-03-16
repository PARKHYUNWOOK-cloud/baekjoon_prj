package baek_19532;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		
		int resultX=0;
		int resultY=0;
		
		
		for(int x = -999; x<=999; x++) {
			for(int y=-999; y<=999;y++) {
				int tempOne = a*x+b*y;
				int tempTwo = d*x+e*y;
				if(tempOne==c&&tempTwo==f) {
					resultX=x;
					resultY=y;
				}
			}//end for
		}//end for 
		
		System.out.println(resultX+" "+resultY);
		br.close();
	}//main
}//class
