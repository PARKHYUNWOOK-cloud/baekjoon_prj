package baek_10807;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N=Integer.parseInt(br.readLine());
		String [] arr = br.readLine().split(" ");
		
		String v=br.readLine();
		int cnt=0;
		if(arr.length==N) {
			for(int i=0;i<arr.length; i++) {
				if(v.equals(arr[i])){
					cnt++;
				}//end if
			}//end for
		}else {
			System.out.println("숫자를 다시 입력해주세요!");
		}//end else
		
		System.out.println(cnt);
		br.close();
	}//main
}//class
