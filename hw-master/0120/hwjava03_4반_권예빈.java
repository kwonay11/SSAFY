package com.ssafy.algo;

import java.util.Scanner;

public class Solution22 {

	public static void main(String[] args) {
		int[] dx = {-1,1,0,0};
		int[] dy = {0,0,-1,1}; //상 하 좌 우
		
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); //테스트케이스
		int k =0;
		for(int tc = 1; tc<=T;tc ++) {
			int N = sc.nextInt(); //배열크기
			int num = sc.nextInt(); //소금쟁이 수
			int lake[][] = new int[N][N]; // 호수 배열 생성
			int cnt = num;
			
			for(int i = 0; i<num; i++) {
				int x =sc.nextInt(); //시작 x좌표
				int y =sc.nextInt(); //시작 y좌표
				int dire =sc.nextInt(); //방향
				
				for( k =3; k>0 ; k--) {  // 3-2-1순
					if(dire == 1) {  //상
						x += dx[0]*k;
						y += dy[0]*k;
					}else if(dire == 2) {  //하
						x += dx[1]*k;
						y += dy[1]*k;
					}else if(dire == 3) {  //좌
						x += dx[2]*k;
						y += dy[2]*k;
					}else if(dire == 4) {  //우
						x += dx[3]*k;
						y += dy[3]*k;
					}
					if((x < 0 || x >=lake.length || y < 0 || y >= lake.length)||lake[x][y] == 1) {  // 판자 밖일 때 카운트 줄이고 포문 나가기
						 // 충돌하거나 판자를 벗어났을경우에 for문에서 벗어나는 break를 걸어준다
						cnt--;
						break;
					}

				}//k
				if(k ==0 ) { // 충돌하지 않았을 때 
					lake[x][y] = 1;
				}
				 
			} //for문 i
			
			System.out.print("\n"+"#"+ tc +" " + cnt); 
		}  //tc

			
	
	
	} //main
			
			
}  //class


