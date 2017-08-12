package edu.mum.domain;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 * Created by yentran
 */
@Document
public class Catagory {
	@Id
	private String id;
	private String name;
	
	List<Product> products;
	List<WishList> wishLists;
	

	public Catagory() {}

	public String getCata_id() {
		return id;
	}

	public void setCata_id(String cata_id) {
		this.id = cata_id;
	}

	public String getCata_name() {
		return name;
	}

	public void setCata_name(String cata_name) {
		this.name = cata_name;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<WishList> getWishLists() {
		return wishLists;
	}

	public void setWishLists(List<WishList> wishLists) {
		this.wishLists = wishLists;
	}

	
	
}
