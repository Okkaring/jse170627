package com.hanbit.algorithm.grade;

import java.util.Scanner;
public class GradeReport{
	public static void main(String[] args){
		// name, kor, eng, math
		// total, avg
		// 홍길동 : B
		
		// definition
		Scanner s=new Scanner(System.in);
		int kor=0, eng=0, math=0,total=0,avg=0;
		String grade="";

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
		
		if(avg>=90 && avg<100){
			grade="A";
		}else if(avg>=80){
			grade="B";
		}else if(avg>=70){
			grade="C";
		}else if(avg>=60){
			grade="D";
		}else if(avg<=59){
			grade="E";
		}else{
			grade="F";
		}
	
	/*System.out.print(name+":"+grade);
	String.format("%s : %s","name","grade"); x 틀린 오답이다..*/
	
	System.out.print("***********************************\n");
	System.out.print("이름     총점      평균     등급    \n");
	System.out.print("-----------------------------------\n");
	System.out.print(String.format("| %s | %d  |  %d   |    %s  | \n",name,total,avg,grade));
	System.out.print("***********************************");
	}
}
