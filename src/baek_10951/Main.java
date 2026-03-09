package baek_10951;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		while (true) {
			String num = br.readLine();
			if(num==null) {
				break;
			}else {
				String[] number=num.split(" ");
				int A = Integer.parseInt(number[0]);
				int B = Integer.parseInt(number[1]);
				sb.append((A+B)+"\n");
			}//end else
		}//end while
		System.out.println(sb);
		br.close();
		
	}//main
}//class
