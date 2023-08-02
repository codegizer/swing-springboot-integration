package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Book;

public interface BookService {
	public List<Book> list();
	public Book register(Book book);
	public void delete(long bookNo);
	
}
 