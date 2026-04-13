package baek_20125;

import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int x = 0;
		int y = 0; 
		int heart =0;
		
		
		String[][] square = new String[N][N];
		
		for(int i = 0; i<square.length; i++) {
			square[i]=br.readLine().split(""); 
		}//end for
		
		for(int i = 0; i<square.length; i++) {
			for(int j =0; j<square[0].length; j++) {
				if("*".equals(square[i][j])) {
					heart++;
					x=i+1;
					y=j;
				}//end if
			}//end for
			if(heart==1) {
				break;
			}//end if
		}//end for 
		
		sb.append((x+1)+" "+(y+1)+"\n");//심장 위치 구하기 
		
		int leftArm=0;
		int rightArm=0;
		int body=0;
		int leftLeg=0;
		int rightLeg=0;
		int bodyEndX=0;
		
		for(int i=0; i<N; i++) {
			if(square[x][i].equals("*")) {
				if(i<y) {
					leftArm++;
				}else if(i!=y) {
					rightArm++;
				}//end else
			}//end if
			
		}//end for 
		//2.3에서 몸통 y를 고정한 *의 개수
		
		for(int i=x+1; i<N; i++) {
			if(square[i][y].equals("*")) {
				body++;
			}else {
				bodyEndX=i-1;
				break;
			}//end if
		}//end for
		
		for(int i=bodyEndX+1; i<N; i++) {
			if(square[i][y-1].equals("*")) {
				leftLeg++;
			}
			if(square[i][y+1].equals("*")) {
				rightLeg++;
			}
		}//end for
		sb.append(leftArm+" "+rightArm+" "+body+" "+leftLeg+" "+rightLeg);
		
		System.out.print(sb);
		
		
		
	}//main
}//class
