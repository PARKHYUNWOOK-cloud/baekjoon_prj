package baek_4659;

import java.io.*;
//연속은 무조건 카운트
//조건 위반시 무조건 탈락
public class Main {
	
	public static boolean Check(String text) {
		boolean flag = false;
		String[] splitData =text.split("");
		int m_cnt=0;
		int j_cnt=0;
		
		for(int i=0; i<splitData.length;i++) {
			
			if("aeiou".contains(splitData[i])) {
				flag=true;
				m_cnt++;
				j_cnt=0;
			}else {
				j_cnt++;
				m_cnt=0;
			}//end else
			
			if(m_cnt==3||j_cnt==3) {
				return false;
			}
			
		
			if(i>0&&splitData[i].equals(splitData[i-1])){
				
				if(!(splitData[i].equals("e")||splitData[i].equals("o"))) {
					return false;
				}//end if
			}//end if
			
		}//end for
		
		
		if(!flag) {
			return false;
		}
		
		return true;
		
	}//check
	
	
	public static void main(String[] args) throws Exception{
		//1. 모음(a,e,i,o,u) 하나를 반드시 포함하여야한다.
		//2. 모음이 3개 혹은 자음이 3개 연속으로 오면 안된다.
		//3. 같은 글자가 연속적으로 두번 오면 안되나, ee와 oo는 허용된다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			String text = br.readLine();
			if("end".equals(text)) {
				break;
			}//end if
			if(Check(text)) {
				sb.append("<"+text+"> is acceptable.\n");
			}else {
				sb.append("<"+text+"> is not acceptable.\n");
			}//end else
		}//end while
	
		System.out.println(sb);
		
	}//main
}//class
