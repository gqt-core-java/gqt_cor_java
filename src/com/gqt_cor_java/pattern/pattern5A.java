package com.gqt_cor_java.pattern;

import java.util.Scanner;

public class pattern5A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the count:");
		int n=sc.nextInt();
		char ch = 'A';
		for(int i=1;i<=n;i++) {
			
			System.out.print(ch+"	");
			ch++;
	}
	}

}
