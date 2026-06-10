package online_shop.com.jdc.work.customer;

import java.time.LocalDate;

public class User {
	
	private String username;
	private String password;
	private double balance;
	private String email;
	private LocalDate date = LocalDate.now();
	
	
	public User(String username,String password,double balance,String email) {
		this.username = username;
		this.password = password;
		this.balance = balance;
		this.email = email;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	
	
	

}
