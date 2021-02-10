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
	
	public Product[] getList() { //��ǰ���� ��ü�� �˻��ϴ� ���
		return Arrays.copyOfRange(products, 0, count);
	} 
	public Product searchByP_num(int p_num) { //��ǰ��ȣ�� ��ǰ�� �˻��ϴ� ���
		for (int i = 0; i < count; ++i) {
			if (products[i].getP_num() == p_num)
				return products[i]; 
		}
		return null;
	}
	public Product searchByName(String name) { //��ǰ������ ��ǰ�� �˻��ϴ� ��� 
		for (int i = 0; i < count; ++i) {
			if (products[i].getName().equals(name))
				return products[i]; 
		}
		return null;
	}
//	TV ������ �˻�
	public TelVision[] getTv() {
		int size = 0;
		for (int i = 0; i < count; ++i) {	// Tv ���� ī��Ʈ
			if (products[i] instanceof TelVision) 
				++size;
		}
		
		TelVision[] result = new TelVision[size];	// ��� ī��Ʈ��ŭ �迭 ����
		int idx = 0;
		for (int i = 0; i < size; ++i) {
			if (products[i] instanceof TelVision) {	// Tv�� �迭�� ���
				result[idx++] = (TelVision)products[i];
			}
		}
		return result;
	} 
//	Refrigerator �� �˻�
	public Ref[] getRef() {
		int size = 0;
		for (int i = 0; i < count; ++i) {	// Ref ���� ī��Ʈ
			if (products[i] instanceof Ref) 
				++size;
		}
		
		Ref[] result = new Ref[size];	// ��� ī��Ʈ��ŭ �迭 ����
		int idx = 0;
		for (int i = 0; i < size; ++i) {
			if (products[i] instanceof Ref) {	// Ref�� �迭�� ���
				result[idx++] = (Ref)products[i];
			}
		}
		return result;
	} 
//	��ǰ��ȣ�� ��ǰ�� �����ϴ� ���
	public void remove(int p_num) {
		for (int i = 0; i < count; ++i) {
			
			if (products[i].getNum()== p_num) {
				products[i] = products[count-1];
				products[count-1]=null;			// ������ ��ǰ null ó��
				--count;						// ����
				break;
			}
		}
	}
//	��ü ��� ��ǰ �ݾ��� ���ϴ� ���
	public int getTotalPrice() {
		int total = 0;
		for (int i = 0; i < count; ++i) {
			total += products[i].getPrice();
		}
		return total;
	}

	

}