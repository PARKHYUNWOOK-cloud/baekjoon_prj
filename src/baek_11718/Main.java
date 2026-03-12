package baek_11718;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			String text =br.readLine();
			if(text==null) {// 정답은 이거인데
			//확실히 실행하려면 if("".equals(text)&&text==null) {
				break;
			}//end if
			sb.append(text+"\n");
			
		}//end while
		System.out.println(sb);
		br.close();
		
	}//main
}//class