package com.off.day4_1;

import java.util.Arrays;

//dao(data access object): crud�۾�
/* ��������Ʈ�� �迭�� �����ϸ� �����ϴ� Ŭ���� */
public class IBookManagerImpl implements IBookManager{
	
	
	private int MAX_SIZE = 100;//������ �ִ� ���� �� , �̱���
	private Book[] books = new Book[MAX_SIZE];
	private static IBookManagerImpl manager;
	
	/*	 * ���� ��ϵ� ���� �� */
	private int size;
	//������
	private IBookManagerImpl() {}
	
	//public method
	public static IBookManagerImpl getInstance() {
		if(manager == null )
			manager = new IBookManagerImpl();
		return manager;
	}
		
	@Override
	public void add(Book book) {
		if(size<MAX_SIZE) books[size++] = book;
	}
	
	@Override
	public void remove(String isbn) {
		for (int i = 0; i < size; ++i) {
			// ������ ������ ã�Ҵٸ� �ش� ���� ��ġ�� �迭�� ���� ������ ������ ����
			if (books[i].getIsbn().equals(isbn)) {
				books[i] = books[size-1];
				books[size-1]=null;			// ������ ���� ��ġ null ó��
				--size;						// ��ϵ� ���� �� ����
				break;
			}
		}
	}
	
	@Override
	public Book[] getList() {
		return Arrays.copyOfRange(books, 0, size);
	}
	
	@Override
	public Book searchByIsbn(String isbn) {
		for (int i = 0; i < size; ++i) {
			if (books[i].getIsbn().equals(isbn)) return books[i]; 
		}
		return null;
	}
	
	@Override
	public Book[] searchByTitle(String title) {
		int count = 0; 
		for (int i = 0; i < size; ++i) {	// ���� ������ �����ϴ� ������ ���� ī��Ʈ
			if (books[i].getTitle().contains(title)) 
				++count;
		}
		Book[] result = new Book[count];	// ��� ī��Ʈ��ŭ �迭 ����
		int idx = 0;
		for (int i = 0; i < size; ++i) {
			if (books[i].getTitle().contains(title)) { // ���� ������ �����ϴ� ������ �迭�� ���
				result[idx++] = books[i];
			}
		}
		return result; 
	}
	
	@Override
	public Magazine[] getMagazines() {
		int count = 0;
		for (int i = 0; i < size; ++i) {	// ���� ���� ī��Ʈ
			if (books[i] instanceof Magazine) 
				++count;
		}
		
		Magazine[] result = new Magazine[count];	// ��� ī��Ʈ��ŭ �迭 ����
		int idx = 0;
		for (int i = 0; i < size; ++i) {
			if (books[i] instanceof Magazine) {	// ������ �迭�� ���
				result[idx++] = (Magazine)books[i];
			}
		}
		return result;
	} 
	
	@Override
	public Book[] getNovel() {
		int count = 0; 
		for (int i = 0; i < size; ++i) {
			if ((books[i] instanceof Novel)) 
				++count;
		}
		
		Novel[] result = new Novel[count];
		int idx = 0;
		for (int i = 0; i < size; ++i) {
			if ((books[i] instanceof Novel)) {
				result[idx++] = (Novel) books[i];  //result�� NovelŸ���̱� ������ ����ȯ �����ش�.
			}
		}
		return result;
	}

	@Override
	public int getTotalPrice() {
		int total = 0;
		for (int i = 0; i < size; ++i) {
			total += books[i].getPrice();
		}
		return total;
	}
	
	@Override
	public double getPriceAvg() {
		return (double)getTotalPrice()/ size;
	}
}
