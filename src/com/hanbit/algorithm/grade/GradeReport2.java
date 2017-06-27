package com.hanbit.algorithm.grade;

import java.util.Scanner;
public class GradeReport2{
	public static void main(String[] args){
		// name, kor, eng, math
		// total, avg
		// 홍길동 : B
		
		// definition
		Scanner s=new Scanner(System.in);
		int kor=0, eng=0, math=0,total=0,avg=0;
		String grade="",result="";

		//input
		System.out.print("Enter Name: \n");
		String name=s.next();		
		System.out.print("Enter korean: \n");
		kor=s.nextInt();
		System.out.print("Enter english: \n");
		eng=s.nextInt();
		System.out.print("Enter math: \n");
		math=s.nextInt();
		
		//operation
		total=kor+eng+math;
		avg=total/3;
		
		
		switch(avg/10) {
            case 10 : case 9 :
				grade="A";
				result="장학금 대상입니다";	
				break;
            case 8 :
				grade="B";
				result="3학점 이수";
				break;
            case 7 :
				grade="C";
				result="2학점 이수";
				break;
            case 6 :
				grade="D";
				result="2학점 이수";
				break;
			case 5 :
				grade="E";
				result="재수강";
				break;
            default :
				grade="F";
				result="학사 경고";
				break;
        }  
	
	System.out.print("***********************************\n");
	System.out.print("이름     총점      평균   등급  \n");
	System.out.print("-----------------------------------\n");
	System.out.print(String.format("| %s | %d  |  %d  |  %s \n",name,total,avg,result));
	System.out.print("***********************************");
	}
}