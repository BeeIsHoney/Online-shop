	package online_shop.com.jdc.work.customer;
	
	import java.time.LocalDate;
	
	public class User {
		
		private int UserId;
		private String username;
		private String password;
		private double balance = 0;
		private String email;
		private Role role = Role.USER;
		private LocalDate date = LocalDate.now();
		private static int count = 1;
		
		public User() {
			
		}
		
		
		public User(String username,String password,String email) {
			this.UserId = count++;
			this.username = username;
			this.password = password;
			this.email = email;
		}
		
		public Role getRole() {
			return role;
		}
	
		public void setRole(Role role) {
			this.role = role;
		}
	
		public User(String username,String password,double balance,String email,Role role) {
			this.UserId = count++;
			this.username = username;
			this.password = password;
			this.balance = balance;
			this.email = email;
			this.role = role;
		}
		
		
		
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.UserId = count++;
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
		public int getUserId() {
			return UserId;
		}
	
		public LocalDate getDate() {
			return date;
		}
		public void setDate(LocalDate date) {
			this.date = date;
		}
		
		
		
		
		
	
	}
