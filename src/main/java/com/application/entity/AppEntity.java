package com.application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table (name="appdetails")
@Entity
public class AppEntity {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int rating;
	private String programe;
	private int noofusers;
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
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getPrograme() {
		return programe;
	}
	public void setPrograme(String programe) {
		this.programe = programe;
	}
	public int getNoofusers() {
		return noofusers;
	}
	public void setNoofusers(int noofusers) {
		this.noofusers = noofusers;
	}
	
	
	
}
