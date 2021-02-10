package com.ssafy.product;

import java.util.Arrays;


public class ProductMgr {

	private static int MAX = 100;
	private Product[] products = new Product[MAX];
	private int count;
	
	
	public void add(Product product) {
		if(count<MAX)
			products[count++] = product ;
	}
	
	public Product[] getList() { //상품정보 전체를 검색하는 기능
		return Arrays.copyOfRange(products, 0, count);
	} 
	public Product searchByP_num(int p_num) { //상품번호로 상품을 검색하는 기능
		for (int i = 0; i < count; ++i) {
			if (products[i].getP_num() == p_num)
				return products[i]; 
		}
		return null;
	}
	public Product searchByName(String name) { //상품명으로 상품을 검색하는 기능 
		for (int i = 0; i < count; ++i) {
			if (products[i].getName().equals(name))
				return products[i]; 
		}
		return null;
	}
//	TV 정보만 검색
	public TelVision[] getTv() {
		int size = 0;
		for (int i = 0; i < count; ++i) {	// Tv 개수 카운트
			if (products[i] instanceof TelVision) 
				++size;
		}
		
		TelVision[] result = new TelVision[size];	// 결과 카운트만큼 배열 생성
		int idx = 0;
		for (int i = 0; i < size; ++i) {
			if (products[i] instanceof TelVision) {	// Tv만 배열에 담기
				result[idx++] = (TelVision)products[i];
			}
		}
		return result;
	} 
//	Refrigerator 만 검색
	public Ref[] getRef() {
		int size = 0;
		for (int i = 0; i < count; ++i) {	// Ref 개수 카운트
			if (products[i] instanceof Ref) 
				++size;
		}
		
		Ref[] result = new Ref[size];	// 결과 카운트만큼 배열 생성
		int idx = 0;
		for (int i = 0; i < size; ++i) {
			if (products[i] instanceof Ref) {	// Ref만 배열에 담기
				result[idx++] = (Ref)products[i];
			}
		}
		return result;
	} 
//	상품번호로 상품을 삭제하는 기능
	public void remove(int p_num) {
		for (int i = 0; i < count; ++i) {
			
			if (products[i].getNum()== p_num) {
				products[i] = products[count-1];
				products[count-1]=null;			// 삭제된 상품 null 처리
				--count;						// 감소
				break;
			}
		}
	}
//	전체 재고 상품 금액을 구하는 기능
	public int getTotalPrice() {
		int total = 0;
		for (int i = 0; i < count; ++i) {
			total += products[i].getPrice();
		}
		return total;
	}

	

}