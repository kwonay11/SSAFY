package com.ssafy.product;

import java.util.Arrays;

public class ProductManager {
Product[] product;
int count=0 ;



	public  ProductManager() { //생성자
		
		product = new Product[100]; 
		
	}
	
	public void add(Product p) {
		product[count++]=p;
	}
	
	public void list() {  //배열 반환
		for(int i = 0 ; i<count;i++) {
			System.out.println( product[i].toString());
		}
	}
	public Product list(int num) { //타입을 Product로 해줘서 그 값을 반환해준다
		for(int i =0 ; i<count;i++) {
			if(product[i].getNum() == num) 
				return product[i];
		}
		return null;
		
	}
	public void delete(int num) {  //상품 번호로 조회뒤 삭제
		for(int i =0;i<count;i++) {  
			if(product[i].getNum()==num) { //상품번호가 num과 같으면
				product[i] = product[count - 1]; // 마지막 위치의 값을 저장
				product[count -1] = null; //마지막 위치의 값을 비워줌
				--count; //개수 한개 줄임
				break;
			}
		}
		
	}
	
	public Product[] priceList(int price) {  //특정가격 이하만 검색
		Product[] low_price = new Product[count]; //배열생성
		int j =0;
		for(int i =0;i<count;i++) {  
			if( product[i].getPrice() <= price) {
				low_price[j] = product[i];
				j++;
			}
			
		}
		return low_price;
		//return Arrays.copyOfRange(low_price,0,j);
	}
	
	
}
