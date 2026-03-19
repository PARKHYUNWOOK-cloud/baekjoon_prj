package baek_2587;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] num = new int[5];
		int sum=0;
		for(int i=0; i<num.length;i++) {
			num[i]=Integer.parseInt(br.readLine());
			sum+=num[i];
		}//end for 
		
		Arrays.sort(num);
		System.out.println(sum/5);
		System.out.println(num[2]);
		
	}//main
}//class
