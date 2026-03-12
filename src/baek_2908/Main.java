package baek_2908;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		//방법 1
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * String[] inputNumArr = br.readLine().split(" ");
		 * 
		 * String[] numOneArr= inputNumArr[0].split("");//역순을 위한 배열 String[] numTwoArr=
		 * inputNumArr[1].split("");//역순을 위한 배열
		 * 
		 * String numOneStr ="";//비교 및 역순 저장을 위한 String String numTwoStr="";//비교 및 역순
		 * 저장을 위한 String
		 * 
		 * for(int i = numOneArr.length-1; i>=0;i-- ) {//역순을 위한 for문
		 * numOneStr+=numOneArr[i]; numTwoStr+=numTwoArr[i]; }//end for
		 * System.out.println(Math.max(Integer.parseInt(numOneStr),Integer.parseInt(
		 * numTwoStr)));
		 * 
		 * br.close();
		 */
		
		//방법 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputNumArr = br.readLine().split(" ");
		
		int numOne = Integer.parseInt(new StringBuilder(inputNumArr[0]).reverse().toString());
		int numTwo = Integer.parseInt(new StringBuilder(inputNumArr[1]).reverse().toString());
		
		System.out.println(Math.max(numOne, numTwo));
		
		br.close();
		
		
		
	}//main
}//class
