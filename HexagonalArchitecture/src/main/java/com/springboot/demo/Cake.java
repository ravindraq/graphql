package com.springboot.demo;

import java.io.Serializable;

public class Cake implements Serializable {
	public static final long serialVersionUID=1000000L;
	private String name;

	

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cake [name=" + name + "]";
	}

	public String getName() {
		
		return name;
	}
	

}
