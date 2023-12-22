package com.healthcare.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {
@Id
private String Name;

private String email;
private int Phone;
private int Age;
private String Diagnosis;
private String Remark;
private String Gender;
public Patient() {
	super();
	// TODO Auto-generated constructor stub
}
public Patient(String name, String email, int phone, int age, String diagnosis, String remark, String gender) {
	super();
	Name = name;
	this.email = email;
	Phone = phone;
	Age = age;
	Diagnosis = diagnosis;
	Remark = remark;
	Gender = gender;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getPhone() {
	return Phone;
}
public void setPhone(int phone) {
	Phone = phone;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
public String getDiagnosis() {
	return Diagnosis;
}
public void setDiagnosis(String diagnosis) {
	Diagnosis = diagnosis;
}
public String getRemark() {
	return Remark;
}
public void setRemark(String remark) {
	Remark = remark;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}


}
