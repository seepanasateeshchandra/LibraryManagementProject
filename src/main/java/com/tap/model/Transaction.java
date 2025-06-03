package com.tap.model;

import java.sql.Date;
import java.time.LocalDate;

public class Transaction {
	
	private int id;
	
	private int user_id;
	
	private int book_id;
	
	private Date borrow_date;
	
	private Date return_date;
	
	private String user_name;
	
	private String book_name;
	
	private int cost;
	
	private int Fine;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public Date getReturn_date() {
		return return_date;
	}

	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}
	
	

	public Date getBorrow_date() {
		return borrow_date;
	}

	public void setBorrow_date(Date borrow_date) {
		this.borrow_date = borrow_date;
	}
	
	
	
	
	

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getFine() {
		return Fine;
	}

	public void setFine(int fine) {
		this.Fine = fine;
	}

	

	
	public Transaction(int id, int user_id, int book_id, Date borrow_date, Date return_date, String user_name,
			String book_name, int cost, int fine) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.book_id = book_id;
		this.borrow_date = borrow_date;
		this.return_date = return_date;
		this.user_name = user_name;
		this.book_name = book_name;
		this.cost = cost;
		this.Fine = fine;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", user_id=" + user_id + ", book_id=" + book_id + ", borrow_date="
				+ borrow_date + ", return_date=" + return_date + ", user_name=" + user_name + ", book_name=" + book_name
				+ ", cost=" + cost + ", Fine=" + Fine + "]";
	}

	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
