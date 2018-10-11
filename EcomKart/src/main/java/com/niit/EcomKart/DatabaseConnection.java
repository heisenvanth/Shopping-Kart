package com.niit.EcomKart;

public class DatabaseConnection {
private String url;
private String DriverClassName;
private String Username;
private String Password;
public String getUrl() {
	System.out.println("url instantsiated");
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getDriverClassName(){
	System.out.println("Driver class name is instansiated");
	return DriverClassName;
}
public void setDriverClassName(String driverClassName) {
	DriverClassName = driverClassName;
}
public String getUsername() {
	System.out.println("Username name is instansiated");
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getPassword() {
	System.out.println("Password is instansiated");
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
}
