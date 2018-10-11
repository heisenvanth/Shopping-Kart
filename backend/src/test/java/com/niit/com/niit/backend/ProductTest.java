package com.niit.com.niit.backend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DBConfiguration.DbConfig;
import com.niit.Dao.ProductDao;
import com.niit.model.Product;


public class ProductTest {
public static void main(String args[])
{
	AnnotationConfigApplicationContext config=new AnnotationConfigApplicationContext();
	config.scan("com.niit.*");
	config.refresh();
	
	
	Product product=(Product)config.getBean("product");
	ProductDao productDao=(ProductDao)config.getBean("ProductDao");
	product.setDescription("Blue pen");
	product.setProductName("Reynolds Pen");
	product.setPrice(50);
	product.setQuantity(100);
	productDao.addProduct(product);
}
}
