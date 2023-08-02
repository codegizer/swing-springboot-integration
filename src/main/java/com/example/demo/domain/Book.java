package com.example.demo.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

//내부DB
@Entity
public class Book implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2785010576140159584L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="book_no")
	private long bookNo;
	
	@NotNull
	//@Length(min=1,max=255)
	private String title;
	
	@NotNull
	//@Length(min=1,max=255)
	private String author;
	
	@NotNull
	//@Length(min=1,max=255)
	private String publisher;
	
	@NotNull
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date pubdate;
	
	@NotNull
	//@Length(min=1,max=13)
	private String isbn;
		
	private String image;
	
	private int price;
	
	private int totpage;

	public long getBookNo() {
		return bookNo;
	}

	public void setBookNo(long bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getPubdate() {
		return pubdate;
	}

	public void setPubdate(Date pubdate) {
		this.pubdate = pubdate;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	public int getTotpage() {
		return totpage;
	}

	public void setTotpage(int totpage) {
		this.totpage = totpage;
	}

}
