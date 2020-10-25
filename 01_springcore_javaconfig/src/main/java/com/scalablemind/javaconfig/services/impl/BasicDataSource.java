package com.scalablemind.javaconfig.services.impl;

import com.scalablemind.javaconfig.services.DataSource;

public class BasicDataSource implements DataSource {
	
	private String url;
	
	private String username;
	
	private String password;
	
	private String driverClassName;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	@Override
	public String toString() {
		return "BasicDataSource [url=" + url + ", username=" + username + ", password=" + password
				+ ", driverClassName=" + driverClassName + "]";
	}
	
	
	
	

}
