package com.edubridge.hibernate.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Empshailaja")
public class Employee {

@Id
@GeneratedValue
@Column(name="emp_id")
private int id;
@Column(name="first_name",unique=true,length=20)
private String firstName;
@Column(name="last_name",nullable=false)
private String lastName;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}




}
