package com.niit.EcomKart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class BeanDemoAndAppContext {
	public static void main(String[]args)
	{
		ApplicationContext context=new FileSystemXmlApplicationContext("beans.xml");
		HelloWorld hw=(HelloWorld)context.getBean("helloWorld");
		DatabaseConnection dc=(DatabaseConnection)context.getBean("databaseConnection");
		hw.HelloWorld();
		System.out.println(dc.getUrl());
		System.out.println(dc.getDriverClassName());
		System.out.println(dc.getUsername());
		System.out.println(dc.getPassword());
		
		
	}

}
