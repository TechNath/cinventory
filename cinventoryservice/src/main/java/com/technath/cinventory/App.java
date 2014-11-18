package com.technath.cinventory;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.technath.cinventory.dao.ProductDAO;
import com.technath.cinventory.model.Product;

public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");
		Product product1 = new Product("20005","abc","abc","100","abc",10.20,1.30,"1011");
		productDAO.insert(product1);
		context.close();
	}
}

