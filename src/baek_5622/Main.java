package baek_5622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] alpa =br.readLine().split("");
		String[] Dial = {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		
		int second = 0;
		for(int i=0;i<alpa.length;i++) {
			for(int j=2;j<Dial.length;j++) {
				if(Dial[j].indexOf(alpa[i])!=-1) {
					second+=2+(j-1);
				}//end for
			}//end for
		}//end for
		
		System.out.println(second);
		br.close();
		 
	}//main
}//class
