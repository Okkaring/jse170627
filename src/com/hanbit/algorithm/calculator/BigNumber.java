package com.hanbit.algorithm.calculator;

import java.util.Scanner;

public class BigNumber{
public static void main(String[] args){
	
	Scanner scan=new Scanner(System.in);
	System.out.println("A값을 입력해 주세요");
	int a= scan.nextInt();
	
	System.out.println("B값을 입력해 주세요");
	int b= scan.nextInt();
	
	System.out.println("C값을 입력해 주세요");
	int c= scan.nextInt();
	}
}
	/*
	가장 큰 값부터 작은 순으로 나열하는 statement 를 완성하시오
	예를 들어, a=4, b=7, c=1 을 입력했다면 . . 7, 4, 1 이 되겠습니다.
	*/