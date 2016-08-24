package com.cmz.service;

public class UserServiceImpl implements UserService {
	private String name;
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

}
