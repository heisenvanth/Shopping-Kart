package com.niit.EcomKart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BeanDemoAndAppContext {
	public static void main(String[]args)
	{
		ApplicationContext context=new FileSystemXmlApplicationContext("beans.xml");
	}

}
