package com.technath.cinventory.dao;

import javax.sql.DataSource;

import com.technath.cinventory.model.Product;
import org.springframework.jdbc.core.JdbcTemplate;
public class ProductDAOImpl implements ProductDAO{

	private DataSource dataSource ;
	private JdbcTemplate jdbcTemplate;


	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	public void insert(Product product){

		StringBuffer sql = new StringBuffer("INSERT INTO db_clinventory.product(productcode,productname,descripition,suppliercode,suppliername,costpriceinr,costpriceus,orderid) ");
		sql.append("VALUES((?,?,?,?,?,?,?,?)");
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql.toString(), new Object[]{product.getProductCode(),product.getProductName(),product.getDescription(),product.getSupplierCode()
				,product.getSupplierName(),product.getCostPriceINR(),product.getCostPriceUSD(),product.getOrderId()});
		

	}

}
