package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.Book;
import com.example.demo.repository.BookRepository;

@Service
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;

	public Book find(Book book) {
		return bookRepository.findByIsbn(book.getIsbn());
	}
	public List<Book> list()
	{	
		return bookRepository.findAllByOrderByBookNoDesc();
	}
	
	public Book register(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	public void delete(Book book){
		// TODO Auto-generated method stub
		bookRepository.delete(book);
	}

	public void delete(long bookNo){
		// TODO Auto-generated method stub
		bookRepository.deleteById(bookNo);
	}

}
