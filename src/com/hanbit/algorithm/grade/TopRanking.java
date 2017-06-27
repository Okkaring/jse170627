package com.hanbit.algorithm.grade;

import java.util.Scanner;

public class TopRanking{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		
		int pers=0, avgs=0, sum=0,max=0,min=0; //배열로 전환

		System.out.print("1반의 총 학생수는 몇명? \n");
		pers=s.nextInt();
		
		int[] avgArr =new int[pers];
		
		
		for(int i=0;i<avgArr.length;i++){
			System.out.print("학생의 평균 점수 입력하세요. (100점 만점) \n");
			avgArr[i]=s.nextInt();
			}
	
		for(int i=0;i<avgArr.length;i++){
			sum+=avgArr[i];
			
			if(i ==0){
				max = avgArr[i];
				min = avgArr[i];
			}else if (max < avgArr[i]){
				max = avgArr[i];
			}else {
				min = avgArr[i];
			}
			}
		
		/*
		max=avgArr[0];
		for(int i=0;i<avgArr.length;i++){
			if(max<avgArr[i]){
				max=avgArr[i];
			}
		min=avgArr[0];
		for(int i=0;i<avgArr.length;i++){
			if(min>avgArr[i]){
				min=avgArr[i];
			}
		}
		*/
		System.out.print("1반의 평균점수는 " + (sum/pers)+"\n");
		System.out.println("최대 점수는 " + max+"\n");
		System.out.println("최소 점수는 " + min+"\n");
			}
		
		}
		//
		//System.out.println("최소 점수는 " + min);
		//이번에는 length가 동적인 배열을 선언해야 합니다.
		//그리고 그 수 만큼 for loop 이 돌고 점수를
		//입력받습니다.
		//현재는 1등점수와 꼴찌 점수를 구하는 로직만 구합니다.