package com.hanbit.algorithm.calculator;

import java.util.Scanner;
public class Divide{
public static void main(String[] args){
System.out.print("Divide");
Scanner s=new Scanner(System.in);
System.out.print("Enter Integer:");
int a=s.nextInt();
System.out.print("Enter Integere:");
int b=s.nextInt();
int c=a/b;
System.out.print("Result:"+c);
}
}