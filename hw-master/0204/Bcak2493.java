package com.ssafy.recursive;

import java.util.*;
import java.util.Scanner;

public class Bcak2493 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		
		int num = sc.nextInt();
		int[] arr = new int[num]; // 신호 받는 카운트
		int[] result = new int [num]; //출력 배열 
		int a = 0 ;int b = 0;
		for(int i = 0; i < num; i++) {
			arr[i] =sc.nextInt();
			stack.push(arr[i]);
		} //값 받기
		int cnt = 0;
		for(int j = num; j >= 0; j--) {
			result[j] = stack.pop(); // 맨 위에 값 출력
		}
		if(result[j]<result[j-1])
		
		if(stack.isEmpty()) // 첫번째 값 0 으로 출력
			
		
		}
		
		
	}

}
