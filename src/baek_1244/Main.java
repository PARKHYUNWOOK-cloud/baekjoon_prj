package baek_1244;


import java.io.*;
import java.util.*;
public class Main {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int switchNum = Integer.parseInt(br.readLine());
		int[] switchArr=new int[switchNum];
		
		st=new StringTokenizer(br.readLine());
		for(int i = 0; i<switchNum; i++) {
			switchArr[i]=Integer.parseInt(st.nextToken());
		}//end for
		
		int studentNum = Integer.parseInt(br.readLine());
		
		for(int i=0; i<studentNum;i++) {
			st=new StringTokenizer(br.readLine());
			int gender = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if(gender==1) {
				for(int j=0; j<switchNum;j++) {
					if((j+1)%num==0) {
						if(switchArr[j]==0) {
							switchArr[j]=1;
						}else {
							switchArr[j]=0;
						}//end else
					}//end if
					
				}//end for
			}else if(gender==2) {
				int tempNum =num-1;
				boolean flag = false;
				if(switchArr[tempNum]==0) {
					switchArr[tempNum]=1;
				}else {
					switchArr[tempNum]=0;
				}//end else
					
					for(int j=1; j<switchNum; j++) {
						if(tempNum-j>-1&&tempNum+j<switchNum) {
							if(switchArr[tempNum-j]==switchArr[tempNum+j]) {
									switchArr[tempNum-j]=1-switchArr[tempNum-j];
									switchArr[tempNum+j]=1-switchArr[tempNum+j];
							}else {
								break;
							}//end else
						
						}else {
							break;
						}
						
				}//end if
			}//end elseif
		}//end for
		int cnt=0;
		for(int i=0; i<switchArr.length;i++) {
			System.out.print(switchArr[i]+" ");
			cnt++;
			if(cnt%20==0) {
				System.out.println();
			}//end if
		}//end for
		
	}//main
}//class
