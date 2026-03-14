package baek_14215;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args)  throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//삼각형이 되는 공식  3개 중 큰 변 나머지 두개 변 보다 커야함
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		//큰수를 구하고 
		int max=Math.max(a, Math.max(b, c));
		int sum = a+b+c;
		if(max<sum-max) {
			System.out.println(sum);
		}else {
			System.out.println((sum-max)*2-1);
		}//end else
		
		
		
		//방법 1 
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//삼각형이 되는 공식  3개 중 큰 변 나머지 두개 변 보다 커야함
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		//큰수를 구하고 
		int max=Math.max(a, Math.max(b, c));
		while(true) {
				
			if(a==max) {
				if(!(a<b+c)) {
					a--;
					max--;
				}else {
					break;
				}//end else
			}else if(b==max){
				if(!(b<a+c)) {
					b--;
					max--;
				}else {
					break;
				}//end else
			}else {
				if(!(c<b+a)) {
					c--;
					max--;
				}else {
					break;
				}//end else
			}//ene else
		
		}//end while
		System.out.println(a+b+c);
 */
			
		br.close();
	}//main
}//class
