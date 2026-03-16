package baek_2231;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine());
		
		int result= 0;
		
		
		
		for(int i = 0; i<N;i++) {
			String num = String.valueOf(i);
			String[] splitNum =  num.split(""); 
			int sum =i;
			for(int j =0; j<splitNum.length;j++) {
				sum+=Integer.parseInt(splitNum[j]);
			}//end for
			if(N==sum) {
				result=Integer.parseInt(num);
				break;
			}//end if
		}//end for
		
		System.out.println(result);
		br.close();
	}//main
}//class
