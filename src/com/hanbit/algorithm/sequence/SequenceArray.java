package com.hanbit.algorithm.sequence;

public class SequenceArray{
	public static void main(String[] args){
		
		int[] arr=new int[10];
		
		for(int i =0;i<10;i++){
			arr[i] =i+1;
			//assignment
		}
		
		int sum=0;	
		for(int i=0; i<arr.length; i++){
		System.out.print(arr[i]+"\t");
		sum+=arr[i]; //누산기/ 누적 +=
		}
		System.out.print("SUM: "+sum);
	}
}

//sequence누적 =  Series 누적