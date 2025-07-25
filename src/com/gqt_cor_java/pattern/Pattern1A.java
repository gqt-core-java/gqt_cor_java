package com.gqt_cor_java.pattern;

import java.util.Scanner;

public class Pattern1A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the count:");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
			System.out.print(j+"	");
			}
			System.out.println();
		}
	}

}
