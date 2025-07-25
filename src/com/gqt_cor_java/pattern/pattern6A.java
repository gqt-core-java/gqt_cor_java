package com.gqt_cor_java.pattern;
import java.util.Scanner;
public class pattern6A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the count:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)   {
            int num;
            if(i%2 == 0){
                num = 0; 
                for (int j = 1; j <=n; j++){
                    System.out.print(num); 
                    num = (num == 0)? 1 : 0;
                }
            }
            else {
                num = 1;
                for (int j = 1; j <=n; j++){
                    System.out.print(num);
                    num = (num == 0)? 1 : 0;
                }
            }
            System.out.println();
        }
        sc.close();
	}

}
