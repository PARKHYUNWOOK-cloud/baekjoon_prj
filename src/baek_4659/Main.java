package baek_4659;

import java.io.*;
import java.util.regex.Pattern;
public class Main {
	public static void main(String[] args) throws Exception{
		//1. 모음(a,e,i,o,u) 하나를 반드시 포함하여야한다.
		//2. 모음이 3개 혹은 자음이 3개 연속으로 오면 안된다.
		//3. 같은 글자가 연속적으로 두번 오면 안되나, ee와 oo는 허용된다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String RegExp1 = ".*[aeiou].*";
		String RegExp2 = "([a-zA-Z])\\1\\1";
		String RegExp3 = ".*(ee|oo).*";
		
		while(true) {
			String text =br.readLine();
			String result = " is acceptable.";
			if("end".equals(text)) {
				break;
			}//end if
	
			if(!Pattern.matches(RegExp1, text)) {
				result = " is not acceptable.";
			}else if(Pattern.matches(RegExp2, text)) {
				result = " is not acceptable.";
			}else if(text.length()>1&&Pattern.matches(RegExp3, text)) {
				result = " is acceptable.";
			}//end elseif
					
			sb.append("<"+text+">"+result+"\n");
			}//end while
		
		
		System.out.println(sb);
			
				
			
	}//main
}//class
