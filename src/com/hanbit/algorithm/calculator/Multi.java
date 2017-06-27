package com.hanbit.algorithm.calculator;

import java.util.Scanner;
public class Multi{
public static void main(String[] args){
System.out.print("곱셈을 할 것 이다 \n");
Scanner s=new Scanner(System.in);
System.out.print("첫번째 정수 입력: \n");
int a=s.nextInt();
System.out.print("두번째 정수 입력 \n");
int b=s.nextInt();
int c=a*b;
System.out.print("곱셈 결과:"+c);
}
}