package org.myhessian.client.bean;

import java.io.Serializable;

public class Person implements Serializable{
	
	private static final long serialVersionUID = -3781172782524059578L;
	private int id ;
	private String name ;
	private int age ;
	private boolean isMan ;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMan() {
		return isMan;
	}
	public void setMan(boolean isMan) {
		this.isMan = isMan;
	}
	
}
