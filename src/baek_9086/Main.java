package baek_9086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 9086- 문자열 - 문자열
 */
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String[] temp = new String[num];
		
		for(int i =0; i<num;i++) {
			String text = br.readLine();
			temp[i]=text.charAt(0)+""+text.charAt(text.length()-1);
		}//end for 
		
		for(int i =0; i<temp.length;i++) {
			System.out.println(temp[i]);
		}//end for 
		
		br.close();
		
	}//main
}//class
