package com.ssafy.recursive;

import java.util.Scanner;

public class Recursive_Back1244 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //����ġ�� ����
		int[] status = new int [N];  //���� 
		for(int n = 0; n < N; n++) {
			status[n] = sc.nextInt();
		}
		
		int students = sc.nextInt(); //�л��� �ޱ�
		
				
		for(int i = 0; i < students; i++) {
			int sex = sc.nextInt();
			int swith = sc.nextInt();  //3
			
			if(sex == 1) {  //���л�
				for(int j = 0; j < N; j++) {
					if((j+1) % swith == 0) {  // ����̹Ƿ�
						if(status[j] == 0)
							status[j] = 1;
						else if(status[j] == 1)
							status[j] = 0;
					}
				//System.out.print(status[j] +" ");
				}
				
				
			}
			
			
			else if(sex == 2) {  //���л�
				int lc = (swith-1) - 1;  //���� ī��Ʈ
				int rc = (swith-1) + 1;  //������ ī��Ʈ
				status[swith-1] = status[swith-1] == 1 ? 0:1;
				
				while(true) {
					if(lc < 0) break;
					if(rc > N-1) break;
					if(status[lc] == status[rc]) {
						status[lc] = status[lc] == 1 ? 0:1;
						status[rc] = status[rc] == 1 ? 0:1;
						lc--; 
						rc++;
					}		
				}
				
			}
		}
		
		for(int k = 0; k < N; k++) {
			System.out.print(status[k] +" " );
		}
		
		
		

		
		
		
	}
}

