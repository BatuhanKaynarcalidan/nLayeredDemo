package nLayeredDemo.entities.concretes;

import nLayeredDemo.entities.abstracts.Entity;

public class Product implements Entity {
	private int id;
	private int categoryId;
	private String name;
	private int unitPrice;
	private int unitsStock;
	
	public Product() {
		
	}
	
	public Product(int id, int categoryId, String name, int unitPrice, int unitsStock) {
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.unitPrice = unitPrice;
		this.unitsStock = unitsStock;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getCategoryId() {
		return categoryId;
	}
	
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getUnitPrice() {
		return unitPrice;
	}
	
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public int getUnitsStock() {
		return unitsStock;
	}
	
	public void setUnitsStock(int unitsStock) {
		this.unitsStock = unitsStock;
	}
	
}
