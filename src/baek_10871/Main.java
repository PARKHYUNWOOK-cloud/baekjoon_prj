package baek_10871;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
			
public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb =new StringBuilder();
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int X=Integer.parseInt(st.nextToken());
		
		st= new StringTokenizer(br.readLine());
		if(st.countTokens()==N) {
			for(int i=0;i<N;i++) {
				int inputNum=Integer.parseInt(st.nextToken());
				if(inputNum<X) {
					sb.append(inputNum+" ");
				}//end if
			}//end for
		}else {
			sb.append("숫자를 다시 입력해주세요!");
		}//end else
		System.out.println(sb);
		
		br.close();

	}//main
}//class
