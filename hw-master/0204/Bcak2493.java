package com.ssafy.recursive;

import java.util.*;
import java.util.Scanner;

public class Bcak2493 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		
		int num = sc.nextInt();
		int[] arr = new int[num]; // ��ȣ �޴� ī��Ʈ
		int[] result = new int [num]; //��� �迭 
		int a = 0 ;int b = 0;
		for(int i = 0; i < num; i++) {
			arr[i] =sc.nextInt();
			stack.push(arr[i]);
		} //�� �ޱ�
		int cnt = 0;
		for(int j = num; j >= 0; j--) {
			result[j] = stack.pop(); // �� ���� �� ���
		}
		if(result[j]<result[j-1])
		
		if(stack.isEmpty()) // ù��° �� 0 ���� ���
			
		
		}
		
		
	}

}
