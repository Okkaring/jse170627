package com.hanbit.algorithm.matrix;

public class MatrixBasic{
	public static void main(String[] args){
	
		int[][] mtx=new int[5][3];
		
		for(int i=0;i<mtx.length;i++){
			for(int j=0;j<mtx[i].length;j++){
				System.out.print("["+i+","+j+"]");
			}
			System.out.print("\n");
		}
	}
}