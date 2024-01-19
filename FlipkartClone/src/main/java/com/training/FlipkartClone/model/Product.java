package com.training.FlipkartClone.model;

import java.util.Locale.Category;

import org.springframework.data.annotation.Id;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
@Id
@Column
@GeneratedValue(strategy=GenerationType.TABLE)
private int id;
@Column
private String name;
@Column
private int price;
@Column 
private int quatity;
@Column
private int ratings;
@ManyToOne(cascade=CascadeType.ALL)
@Column(name="categories")
private Category categories;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQuatity() {
	return quatity;
}
public void setQuatity(int quatity) {
	this.quatity = quatity;
}
public int getRatings() {
	return ratings;
}
public void setRatings(int ratings) {
	this.ratings = ratings;
}

}
