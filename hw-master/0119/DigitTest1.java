package com.ssafy.algo;
import java.util.*;
public class DigitTest1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int num = 0; 
	
	int cnt[] = new int[10];
	while(true) {
		num = sc.nextInt();
		cnt[num/10]++; //���� �ڸ� ����
		
		if(num ==0) {
			cnt[0]--;
			break;
		}
	}
		for(int i =0; i<10; i++) {
			if(cnt[i] != 0) {
				System.out.println(i + ":" +cnt[i] +"��");
			}
		}
		
		
	
	
}

}
