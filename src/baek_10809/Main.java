package baek_10809;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text =sc.next();
		String[] splitText=text.split("");
		int[] lower= new int[26];
		Arrays.fill(lower, -1);
		for(int i =0; i<splitText.length;i++) {
			int alpa=(int)splitText[i].charAt(0)-'a';
			int index=text.indexOf(splitText[i]);
			lower[alpa]=index;
		}//end for
		
		for(int i =0; i<lower.length;i++) {
			System.out.print(lower[i]+" ");
		}//end for
		
	}//main
}//class
