package com.hanbit.algorithm.calculator;

/*
클라이언트에서 프로그램 개발 요청이 왔습니다.
이름과 연봉을 입력받아서
연봉 ***만원을 받으시는 xxx님께서 납부할 세금은???만원입니다.
로 출력하는 프로그램을 만들어 주세요.
현재는 세율이 9.7프로라고 합니다.
*/

import java.util.Scanner;

public class TaxCalculator{
	public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.print("이름을 입력 하시오 \n");
	String name=s.next();
	System.out.print("이름: "+name+"\n");
	
	System.out.print("연봉 입력 하시오(단위: 만원)\n");
	int salary=s.nextInt();
	System.out.print("연봉: "+salary+"\n");
	
	String result="";
	double tax=(salary*9.7)/100;
	double taxRate=9.7;
	
	tax=(int) (salary * taxRate);
	
	System.out.print("*******************************************\n");
	System.out.print("이름 | 연봉 |  세율  |  납부할 세금  \n");
	System.out.print("------------------------------------------\n");
	System.out.println(String.format("%s   |  %d 만원  | %d   |   %d 만원    ",name,salary,(taxRate*100),tax));	
	System.out.print(String.format("연봉%d만원을 받으시는 %s님께서 납부할 세금은 %d만원입니다.",salary,name,tax));	
	}
}
