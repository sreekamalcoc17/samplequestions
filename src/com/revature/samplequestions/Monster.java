package com.revature.samplequestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Monster {
	
	public static int mymethod(int noM,int initial_exp, ArrayList mon,ArrayList bonus) {
		ArrayList<Integer> temp_mon = mon;
		Collections.sort(temp_mon);
		int count = 0;
		
			for(int i=0;i<temp_mon.size(); i++) {
				if(temp_mon.get(i)  <= initial_exp) {
					int temp_index = mon.indexOf(temp_mon.get(i));
					int bon = (int) bonus.get(temp_index);
					initial_exp = initial_exp + bon;
					count++;
				}
			}
		
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> mon = new ArrayList<Integer>();
		ArrayList<Integer> bonus = new ArrayList<Integer>();
		
		
		int noM = sc.nextInt();
		int initial_exp = sc.nextInt();
		
		for(int i = 0; i<noM;i++) {
			mon.add(sc.nextInt());
		}
		for(int i = 0; i<noM;i++) {
			bonus.add(sc.nextInt());
		}
		

		System.out.println(mymethod(noM, initial_exp, mon, bonus));
	}

}
