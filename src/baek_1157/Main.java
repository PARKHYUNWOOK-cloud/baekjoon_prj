package baek_1157;

import java.util.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] textSplit = sc.next().toLowerCase().split("");
		int max =0;
		char result='?';
		int cnt=0;
		
		int asc[] =new int[26];//a~z
		for(int i =0; i<textSplit.length;i++) {
			int temp= textSplit[i].charAt(0)-'a';
			asc[temp]++;
		}//end for 
		
		for(int i =0; i<asc.length;i++) {
			if( max<asc[i]) {
				max=asc[i];
				result=(char)(i+'A');
			}//end else
			
		}//end for 
		
		for(int i =0; i<asc.length;i++) {
			if( max==asc[i]) {
				cnt++;
			}//end else
			
		}//end for 
		if(cnt>1) result='?';
			
		System.out.println(result);
	}//main
}//class
