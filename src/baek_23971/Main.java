package baek_23971;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer(br.readLine());
		
		int H=Integer.parseInt(st.nextToken());//열
		int W=Integer.parseInt(st.nextToken());//행
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		
		int row=(int)Math.ceil(H/(N+1.0));
		int col=(int)Math.ceil(W/(M+1.0));
		
		System.out.println(row*col);
		br.close();
}//main
}//class
