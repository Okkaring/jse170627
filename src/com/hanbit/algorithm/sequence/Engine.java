package com.hanbit.algorithm.sequence;

import java.util.Scanner;

public class Engine{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		while(true){
			System.out.print("0.종료 1. 시작 2.BMI \n");
			String menu=s.next();
			switch(menu){
				case "0":
					System.out.print("시스템 종료!!");
				return; //종료할때는return을 쓴다.
				case "1":
					System.out.print("시스템 시작!! \n");
				break;
				case "2":
					System.out.print("BMI!! \n");
				break;
			}
		}
	}
}