package com.hanbit.algorithm.member;

import java.util.Scanner;
public class SSN{
	public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	
	int gap=0,age=0;
	
	System.out.println("이름을 입력하세요");
	String name=s.next();
	System.out.println("주민등록번호를 입력하세요");
	String ssn=s.next();
	
	String sYear=ssn.substring(0,2); //(*인덱스 index , *count )
	int year=Integer.parseInt(sYear); // (이걸) Int 숫자형으로 parse 바꿔라는 말

	/*
	if(gap>=0){
		age=2017-(year+2000)+1;
	}else{
		age=2017-(year+1900)+1;
	}
	*/

	char ch = ssn.charAt(7);
	String gender = "";
	switch(ch) {
		case '1' : case '3' :
			gender="남";
			break;
		case '2' : case '4' :
			gender="여";
			break;
		case '5' : 
			gender="외국남";
			break;
		case '6' :
			gender="외국녀";
			break;
		default :
			gender="외계인";
			break;
	}
	System.out.print("***********************************\n");
	System.out.print("     이름     나이     성별      \n");
	System.out.print("-----------------------------------\n");
	System.out.print(String.format("    %s    %d    %s \n",name,((17-year)>=0)?2017-(year+2000)+1:"age=2017-(year+1900)+1",gender));
	System.out.print("***********************************");
	}
	}
	// ******************
	// 이름 나이 성별
	//------------------
	// 홍길동 20세 남
	// ******************