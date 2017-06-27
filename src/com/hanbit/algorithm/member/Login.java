package com.hanbit.algorithm.member;

import java.util.Scanner;
public class Login{
	public static final String USER_ID="Kim";
	public static final String USER_PASS="1";
	
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("Login\n");
		String message="";
		System.out.print("Enter ID: \n");
		String id=s.next();
		System.out.print("Enter PASS: \n");
		String ps=s.next();
			if(!id.equals(USER_ID)){
			
			}else if(!ps.equals(USER_PASS)){	
				message="NOT EXIST";
			}else{
				message="NOT EXIST";
			}
			System.out.print(message);
	}
}