package com.off.day4_1;

public interface IBookManager {

	void add(Book book);

	void remove(String isbn);

	Book[] getList();

	Book searchByIsbn(String isbn);

	Book[] searchByTitle(String title);

	Magazine[] getMagazines();

	Book[] getNovel();

	int getTotalPrice();

	double getPriceAvg();

}