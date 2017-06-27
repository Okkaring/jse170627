package com.hanbit.algorithm.hello;

import java.util.Scanner;
public class Hello{
public static void main(String[] args){
System.out.print("What's your name?\n");
Scanner scanner=new Scanner(System.in);
String name=scanner.next();
System.out.print("Hello !!"+name);
}
}