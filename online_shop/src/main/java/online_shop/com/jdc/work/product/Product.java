package online_shop.com.jdc.work.product;

public class Product {

	private int id;
	private String name;
	private double price;
	private String description;
    private int quantity;
    private String category;
    private String brand;
    
    public Product() {}
    public Product(int id, String name, double price, String description,
    		int quantity, String category, String brand) {
    	this.name = name;
    	this.price = price;
    	this.description = description;
    	this.quantity = quantity;
    	this.category = category ;
    	this.brand = brand;
    }
    public void setId(int id) {
    	this.id = id;
    }
    public int getId() {
    	return id;
    }
    public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
