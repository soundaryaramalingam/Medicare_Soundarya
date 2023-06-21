package com.MedicareBackend.Model;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="medicine")
public class Medicine {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;
	    
	   @Column(name="name")
	    private String name;
	   
	   @Column(name="descr")
	    private String descr;
	    
	   @Column(name="category")
	    private String category;
	   
	   @Column(name="quantity")
	    private int quantity;
	   
	   @Column(name="price")
	    private int price;
	   

	   @Column(name="expirydate")
	    private String expirydate;
	   
	 
	   
		public Medicine() {
		super();
	}

		public Medicine(String name, String descr, String category, int quantity, int price, String expirydate, byte[] image) {
		super();
		this.name = name;
		this.descr = descr;
		this.category = category;
		this.quantity = quantity;
		this.price = price;
		this.expirydate = expirydate;
	//	this.image=image;
	}





		public String getExpirydate() {
			return expirydate;
		}

		public void setExpirydate(String expirydate) {
			this.expirydate = expirydate;
		}

		public int getQuantity() {
		return quantity;
	}




	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}




	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		this.price = price;
	}


/*

	public String getExpirydate() {
		return expirydate;
	}




	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}

*/


		public String getDescr() {
		return descr;
	}




	public void setDescr(String descr) {
		this.descr = descr;
	}




	public String getCategory() {
		return category;
	}




	public void setCategory(String category) {
		this.category = category;
	}




		public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Medicine [id=" + id + ", name=" + name + ", descr=" + descr + ", category=" + category + ", quantity="
				+ quantity + ", price=" + price + ", expirydate=" + expirydate 
				+ "]";
	}








	
}
