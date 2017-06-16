package com.manju.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category 
{
	@Id
	private int categoryId;
    private String category;
	public int getUserId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getCategoryId() {
		return categoryId;
	}
	
}
