package baek_10952;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			
			String[] num = br.readLine().split(" ");
			int A = Integer.parseInt(num[0]);
			int B = Integer.parseInt(num[1]);
			
			if(A!=0&&B!=0) {
				sb.append((A+B)+"\n");
			}else {
				break;
			}//end else
		}//end while
		System.out.println(sb);
		br.close();
	}//main
}//class
