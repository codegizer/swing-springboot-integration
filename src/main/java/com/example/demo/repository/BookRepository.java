package com.example.demo.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.domain.Book;
 
@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
	public List<Book> findAllByOrderByBookNoDesc();
	public Book findByIsbn(String isbn);
	public Book findByIsbnAndPubdate(String isbn, Date pubDate);	

}
