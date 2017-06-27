package com.hanbit.algorithm.application;

import java.util.Scanner;
public class Bmi{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		
		System.out.print("height:  m(미터) (주의: 키가 179cm일 경우 1.79로 표기)\n");
		double height=s.nextDouble();
		System.out.print("키는: "+height+"m\n");
		
		System.out.print("weight:  kg(킬로그램)\n");
		double weight=s.nextDouble();
		System.out.print("몸무게는: "+weight+"m\n");
		
		double bmi=weight/(height*height);
		
		String result=null;

		
		if(bmi<=18.5){
			result="lowWeight";
		}else if(18.5<bmi){
			result="normalWeight";
		}else if(bmi<=25){
			result="normalWeight";
		}else if(25.0<=bmi){
			result="overWeight";
		}else if(bmi<=30.0){
			result="overWeight";
		}else{
			result="obesity";
		}
		System.out.print("my BMI: "+result);
		
	}
}