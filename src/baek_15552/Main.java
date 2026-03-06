package baek_15552;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 15552 for - 빠른 A+B
 */
public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t=Integer.parseInt( br.readLine());
		for(int i=0;i<t;i++) {
			String[] number = br.readLine().split(" ");
			int sum=Integer.parseInt(number[0])+Integer.parseInt(number[1]);
			bw.write(String.valueOf(sum));
			bw.newLine();
		}//end for 
		bw.flush();
		br.close();
		bw.close();
	}//main

}//class
