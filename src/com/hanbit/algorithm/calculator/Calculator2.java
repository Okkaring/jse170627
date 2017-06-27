package com.hanbit.algorithm.calculator;

import java.util.Scanner;
public class Calculator2{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Num1: \n");
		int a=s.nextInt();
		System.out.print("Enter opcode: +,-,*,/ \n");
		String op=s.next();
		System.out.print("Enter Num2: \n");
		int b=s.nextInt();
		int result=0;
		if(op.equals("+")){
			result=a+b;
		}else if(op.equals("-")){
			result=a-b;
		}else if(op.equals("*")){
			result=a*b;
		}else{
			result=a/b;
		}
		System.out.print(String.format("%d %s %d =%d",a,op,b,result));
	}
}