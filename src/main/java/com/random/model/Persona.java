package com.random.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prospective_buyer")
public class Persona {
	
@Id
@Column(name="prospective_buyer_key")
private int id;
@Column(name="fist_name")
private String name;
@Column(name="last_name")
private String lastname;
public Persona(int id, String name, String lastname) {
	super();
	this.id = id;
	this.name = name;
	this.lastname = lastname;
}
public Persona() {
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
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}


}
