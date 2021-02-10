package com.ssafy.recursive;

import java.util.Scanner;

public class Snail {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		int dx[] = {0,1,0,-1}; //우,하,좌,상
		int dy[] = {1,0,-1,0};
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
		
			int[][] snail = new int[N][N];
           
			int x = 0;
			int y = 0;
			int dir = 0; //처음은 오른쪽으로
			
            
			for(int i = 1; i <= N*N; i++) {
				
			
				snail[x][y] = i;
				x += dx[dir]; //다음이동할 값 방향으로 커서가 돌아봐주기
				y += dy[dir]; 

				
                //범위를 벗어나는 경우 , 값이 들어가있을 경우 방향 전환
				if(x >= N || y >= N || x < 0 || y < 0 || snail[x][y] != 0) {
					//원래 위치로 돌려주고
                    x -= dx[dir];
					y -= dy[dir];
                    
                    //방향 전환 
					dir = (dir+1)%4;
				
                    //전환한 방향으로 커서 돌려주기
					x += dx[dir];
					y += dy[dir];
				}
				
				
			}
			
			System.out.println("#"+tc);
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					System.out.print(snail[i][j]+" ");
				}
				System.out.println();
			}
		}
		
		
		
	}

	
}
