package baek_11021;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args)  throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt( br.readLine());
		int[] result=new int[t];
		for(int i =0; i<t;i++) {
			String [] num = br.readLine().split(" ");
			int sum=Integer.parseInt(num[0])+Integer.parseInt(num[1]);
			bw.write("Case #"+(i+1)+": "+sum);
			bw.newLine();
		}//end for
			bw.flush();
			br.close();
			bw.close();
	}//main
}//class
