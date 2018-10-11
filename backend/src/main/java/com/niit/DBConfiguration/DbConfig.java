package com.niit.DBConfiguration;

import java.util.Properties;

import javax.persistence.AttributeOverride;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.model.Product;
@Configuration
@EnableTransactionManagement
@ComponentScan("com.niit.*")
public class DbConfig {
		public DbConfig()
		{
			System.out.println("DBConfiguration bean is created");
		}
		@Autowired
		@Bean
		public DataSource getDataSource() {
			System.out.println("Entering Datasource bean creation method");
			BasicDataSource dS=new BasicDataSource();
			dS.setDriverClassName("org.h2.Driver");
			dS.setUrl("jdbc:h2:tcp://localhost/~/s190125_125");
			dS.setUsername("hima");
			dS.setPassword("hima");
			System.out.println("Datasource bean="+dS);
			return dS;

		}
		@Autowired
		@Bean
		public SessionFactory sessionFactory() {
			System.out.println("Entering Session Factory bean creation method");
			LocalSessionFactoryBuilder lsf=new LocalSessionFactoryBuilder(getDataSource());
			Properties hibernateProperties=new Properties();
			hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
			hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
			hibernateProperties.setProperty("hibernate.show_sql", "true");
			lsf.addProperties(hibernateProperties);
			Class classes[]=new Class[] {Product.class};
			System.out.println("Local Session factory bean="+lsf);
			return lsf.addAnnotatedClasses(classes).buildSessionFactory();
			
		}
		@Bean
		public HibernateTransactionManager hibernateTransactionManager() {
			return new HibernateTransactionManager(sessionFactory());
			


}}
