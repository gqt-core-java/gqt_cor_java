package com.gqt_cor_java.pattern;

import java.util.Scanner;

public class Pattern17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the count:");
		int n=sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(k+"	");
			k++;
			}
			System.out.println();
		}
	}
}
