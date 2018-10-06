package com.proginators.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "DATA")
@Entity
public class Stack {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String element;

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

}
