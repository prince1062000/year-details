package com.example.practice.dto;

import java.io.Serializable;

public class Day implements Serializable {

	private static final long serialVersionUID = -3061150042234188235L;
	int day;
	String name;

	public Day(int day, String name) {
		this.day = day;
		this.name = name;
	}

	@Override
	public String toString() {
		return "{ day: " + day + ", name: \"" + name + "\" }";
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
