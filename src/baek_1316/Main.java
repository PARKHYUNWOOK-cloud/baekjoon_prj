package baek_1316;

import java.util.*;
//연속인것은 무조건 카운트;
//배열의 개수를 구하고 연속인지 아닌지를 체크한다.
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cnt=0;
		
		//문장의 수가 26
		for(int i =0; i<N; i++) {
			boolean flag = true;
			int[] alphArr = new int[26]; 
			String text = sc.next();
			for(int j =0; j<text.length(); j++) {
				char alph=text.charAt(j);
				int alphNum = alph-'a';
				
				if(j>0) {
					if(!(text.charAt(j)==text.charAt(j-1))) {
						if(alphArr[alphNum]>0) {
							flag=false;

						}else {
							alphArr[alphNum]+=1;
						}
					}
				}else {
					alphArr[alphNum]+=1;
				}
			
			}//end for 
			if(flag) {
				cnt++;
			}//end if
		}//end for 
		System.out.println(cnt);
		
	}//main
}//class
