package com.entity;

import javax.persistence.*;

@Entity 
public class stu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String name;
	private String roll;
	public stu() {
		super();
		
	}
	
	public stu(String name, String roll) {
		super();
		this.name = name;
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	@Override
	public String toString() {
		return "student [name=" + name + ", roll=" + roll + "]";
	}
	
	
}
