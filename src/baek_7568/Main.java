package baek_7568;


import java.io.*;
import java.util.*;
public class Main {
	
	static class Body{
		int height;
		int weight;
		
		public Body(int weight,int height) {
			this.height=height;
			this.weight=weight;
		}//body
	}//body
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb= new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int count =0;
		
		Body[] body = new Body[N];
		for(int i= 0 ; i<N ; i++) {
			st=new StringTokenizer(br.readLine());
			int weight=Integer.parseInt(st.nextToken());
			int height=Integer.parseInt(st.nextToken());
			body[i]=new Body(weight,height);
		}//end for 
		
		for(int i=0; i<N;i++) {
			count=0;
			for(int j=0; j<N;j++) {
				if(i!=j) {
					if(body[i].weight<body[j].weight&&body[i].height<body[j].height) {
						count++;
					}//end if
				}//end if
			}//end for
			sb.append(count+1+" ");
		}//end for
		
		System.out.println(sb);
		br.close();
	}//main
}//class
