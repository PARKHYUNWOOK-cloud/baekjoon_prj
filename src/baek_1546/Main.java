package baek_1546;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n =Integer.parseInt(br.readLine());
		double[] num = new double[n];
		double sum =0;
		int maxNum = 0;
		
		st=new StringTokenizer(br.readLine());
		for(int i=0; i<n;i++) {
			num[i]=Integer.parseInt(st.nextToken());
			maxNum=Math.max(maxNum, (int)num[i]);
		}//end for
		for(int i=0; i<n;i++) {
			num[i]=num[i]/maxNum*100;
			sum+=num[i];
		}//end for 
		System.out.println(sum/n);
		
		br.close();
	}//class
}//main
