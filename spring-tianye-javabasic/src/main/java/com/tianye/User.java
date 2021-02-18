package com.tianye;

import org.springframework.stereotype.Component;

@Component
public class User {

	private String name = "tianye";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
