package com.gqt_cor_java.pattern;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int k=1;
		System.out.print("Enter the count:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(k+"	");
			k++;
			}
			System.out.println();
		}
	}

}
