package com.gqt_cor_java.pattern;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter the count:");
		int n=sc.nextInt();
		int k;
		for(int i=1;i<=n;i++) {
			k=i;
			for(int j=i;j<=i+20;j=j+5) {
				
			System.out.print(j+"	");
			k=k+n;
			}
			System.out.println("");
		}
	}

}
