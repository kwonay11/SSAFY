package com.ssafy.recursive;

import java.util.Scanner;

public class Crop {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();  //�׽�Ʈ���̽�
        
        
        for(int t = 0; t < tc; t++) {
            int n = sc.nextInt(); //n�ޱ�
            int arr[][] = new int[n][n];
            int sum = 0;
            for(int i =0; i < n; i++) {
            	String str = sc.next();
            	for(int j = 0; j < n; j++) {
            		arr[i][j] = str.charAt(j)-'0'; 
            		//���� Ÿ���̱⶧���� ���ڷ� �ٲ��ֱ� ���ؼ��� '0'��������Ѵ�
            	}
            }//�迭 �ޱ�
            
            
        for(int i = 0; i <= n/2; i++) {
        	for(int j = n/2 - i; j <= n/2 + i; j++) {
        		sum += arr[i][j];
        		
        	}
        	
        }//��� �ﰢ��(�߰��α���)
        int a = 1;
        for(int i = n/2 +1 ; i < n; i++) {
        	for(int j = a; j <= n-1-a; j++) {
        		sum += arr[i][j];
        	}
        	a++;
        }//�ϴ� �ﰢ��
        System.out.println("#" + tc +" "+ sum);
        }

	}

}
