package com.briz.springbootmodelmapperexample;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="book")
public class Book 
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int id;
String bname;
String aname;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}
}
