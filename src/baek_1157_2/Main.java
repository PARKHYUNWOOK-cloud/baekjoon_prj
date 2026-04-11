package baek_1157_2;



import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] text = sc.next().toUpperCase().split("");
		int max=0;
		String result="";
		int[] alphArr=new int[26];
		
		for(int i =0; i<text.length; i++) {
			int alphNum = text[i].charAt(0)-'A';
			alphArr[alphNum]+=1;
		}//end for
		
		for(int i =0; i<alphArr.length; i++) {
			if(alphArr[i]>max) {
				max=alphArr[i];
				result=Character.toString(i+'A');
			}else if(alphArr[i]==max) {
				result="?";
			}//end elseif
			
		}//end for
		
		System.out.println(result);
	}//main
}//class
