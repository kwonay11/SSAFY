package com.ssafy.recursive;

import java.util.Scanner;

public class Crop {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();  //테스트케이스
        
        
        for(int t = 0; t < tc; t++) {
            int n = sc.nextInt(); //n받기
            int arr[][] = new int[n][n];
            int sum = 0;
            for(int i =0; i < n; i++) {
            	String str = sc.next();
            	for(int j = 0; j < n; j++) {
            		arr[i][j] = str.charAt(j)-'0'; 
            		//문자 타입이기때문에 숫자로 바꿔주기 위해서는 '0'을빼줘야한다
            	}
            }//배열 받기
            
            
        for(int i = 0; i <= n/2; i++) {
        	for(int j = n/2 - i; j <= n/2 + i; j++) {
        		sum += arr[i][j];
        		
        	}
        	
        }//상단 삼각형(중간부까지)
        int a = 1;
        for(int i = n/2 +1 ; i < n; i++) {
        	for(int j = a; j <= n-1-a; j++) {
        		sum += arr[i][j];
        	}
        	a++;
        }//하단 삼각형
        System.out.println("#" + tc +" "+ sum);
        }

	}

}
