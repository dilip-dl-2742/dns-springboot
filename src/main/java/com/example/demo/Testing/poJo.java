package com.example.demo.Testing;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class poJo {
 private String name;
 private int age;
 private String town;
 
 /*public poJo() {
	 
 }*/
		
public poJo(String name, int age, String town) {
	super();
	this.name = name;
	this.age = age;
	this.town = town;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getTown() {
	return town;
}
public void setTown(String town) {
	this.town = town;
}
 
}
