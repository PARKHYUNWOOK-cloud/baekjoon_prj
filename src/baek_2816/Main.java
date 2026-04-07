package baek_2816;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int arrow=0;
		int num = sc.nextInt();
		
		String[] channel=new String[num];
		
		for(int i = 0; i<channel.length;i++) {
			channel[i]=sc.next();
		}//end for
		
		while(!channel[0].equals("KBS1")) {	
//			if(arrow+1<channel.length&&channel[arrow+1].equals("KBS1")) {
//				String temp=channel[arrow];
//				channel[arrow]=channel[arrow+1];
//				channel[arrow+1]=temp;
//				arrow++;
//				sb.append("3");
//			}
		if(arrow>=1&&channel[arrow].equals("KBS1")){
				String temp=channel[arrow];
				channel[arrow]=channel[arrow-1];
				channel[arrow-1]=temp;
				sb.append("4");
				arrow--;
			}else if(arrow+1<channel.length) {
					arrow++;
					sb.append("1");
				}
			
		}//end while
		
		while(!channel[1].equals("KBS2")) {	
		
//			if(arrow+1<channel.length&&channel[arrow+1].equals("KBS2")) {
//				String temp=channel[arrow];
//				channel[arrow]=channel[arrow+1];
//				channel[arrow+1]=temp;
//				arrow++;
//				sb.append("3");
//			}
			if(arrow>=1&&channel[arrow].equals("KBS2")){
				String temp=channel[arrow];
				channel[arrow]=channel[arrow-1];
				channel[arrow-1]=temp;
				sb.append("4");
				arrow--;
			}else if(arrow+1<channel.length) {
				arrow++;
				sb.append("1");
			}
			
		}//end while
		
		System.out.println(sb);
		
	}//main
}//class
