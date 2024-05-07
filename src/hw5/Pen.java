package hw5;

abstract class Pen {
	private String brand ;
	private double price;
	
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public Pen() {
		
	}
	
	public Pen(String brand,int price) {
		this.brand = brand;
		this.price = price;
	}
	
	public abstract void write();
	
}