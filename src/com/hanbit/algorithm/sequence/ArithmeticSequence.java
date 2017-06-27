package com.hanbit.algorithm.sequence;

public class ArithmeticSequence{
	public static void main(String[] args){
	
	//i = 곱할수 , j=단
	
	for(int i=1;i<10;){
		for(int j=2;j<10;){
			System.out.print(j+"x"+i+"="+j*i+"tab");
			j++;
		}
		System.out.print("\n");
		i++;
	}
	}
}

/*
public class ArithmeticSequence{
   public static void main(String[]args){
      int i=0,k=0;
      System.out.print("구구단 \n");
      
      for(k=1;k<10;k++){
         for(i=2;i<6;i++){
            System.out.print(i+"*"+k+"="+(i*k)+"\t");
          }   System.out.print("\n");
      }
 
      System.out.print("\n");
      
      for(k=1;k<10;k++){
         for(i=6;i<10;i++){
            System.out.print(i+"*"+k+"="+(i*k)+"\t");
          }   System.out.print("\n");
      }   
   }
}
*/