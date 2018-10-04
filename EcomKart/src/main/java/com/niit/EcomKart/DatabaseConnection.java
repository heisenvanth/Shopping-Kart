package com.niit.EcomKart;

public class DatabaseConnection {
private String url;
private String DriverClassName;
private String Username;
private String Password;
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getDriverClassName() {
	return DriverClassName;
}
public void setDriverClassName(String driverClassName) {
	DriverClassName = driverClassName;
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
}
