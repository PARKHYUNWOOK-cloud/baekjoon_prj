package baek_11022;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			String num[]=br.readLine().split(" ");
			bw.write("Case #"+(i+1)+": "+num[0]+" + "+num[1]+" = "+(Integer.parseInt(num[0])+Integer.parseInt(num[1])));
			bw.newLine();
		}//end for

		bw.flush();
		br.close();
		bw.close();
		
	}//main
}//class
