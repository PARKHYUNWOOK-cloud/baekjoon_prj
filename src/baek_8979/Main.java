package baek_8979;

import java.util.*;
import java.io.*;

public class Main {
	
	static class Country {
		int num;
		int gold;
		int silver;
		int bronze;
		
		Country(int num, int gold, int silver, int bronze){
			this.num = num;
			this.gold = gold;
			this.silver = silver;
			this.bronze = bronze;
		}
	}
	
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		
		st=new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int rank=0;
		int index=0;
		
		
		Country[] county = new Country[N];
		
		for(int i =0; i<county.length; i++) {
			st=new StringTokenizer(br.readLine());
			int num= Integer.parseInt(st.nextToken());
			int gold= Integer.parseInt(st.nextToken());
			int silver= Integer.parseInt(st.nextToken());
			int bronze= Integer.parseInt(st.nextToken());

			county[i]=new Country(num,gold,silver,bronze);
		}//end for 
		
		for(int i =0; i<county.length; i++) {
			if(county[i].num==K) {
				index=i;
			}//end if
		}//end for 
		
		for(int i =0; i<county.length; i++) {
			if(i!=index) {
				if(county[index].gold<county[i].gold) {
					rank++;
				}else if(county[index].gold==county[i].gold&&county[index].silver<county[i].silver) {
					rank++;
				}else if(county[index].gold==county[i].gold&&county[index].silver==county[i].silver&&county[index].bronze<county[i].bronze) {
					rank++;
				}//end elseif
				
			}//end if
	
		}//end for 
		
		System.out.println(rank+1);
		br.close();
	}//main
}//class
