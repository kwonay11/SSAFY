package com.ssafy.product;

import java.util.ArrayList;

public interface IProductMgr {

	void add(Product product);

	ArrayList<Product> getList();

	ArrayList<Product> searchByP_num(int p_num);

	ArrayList<Product> searchByName(String name);

	//	TV ������ �˻�
	TelVision[] getTv();

	//	Refrigerator �� �˻�
	Ref[] getRef();

	//400L�̻� ����� �˻�
	Ref[] getRefLiter();

	//50��ġ�̻��� Ƽ�� �˻�
	TelVision[] getTvInch();

	//	��ǰ��ȣ�� ��ǰ�� �����ϴ� ���
	void remove(int p_num);

	//	��ü ��� ��ǰ �ݾ��� ���ϴ� ���
	int getTotalPrice();

}