package com.ecommerce.microcommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.microcommerce.dao.ProductDao;
import com.ecommerce.microcommerce.dto.ProductMargeDto;
import com.ecommerce.microcommerce.model.Product;

@Service
public class ProductService {
	@Autowired
	ProductDao productDao;

	public List<ProductMargeDto> calculerMargeProduit() {
		List<ProductMargeDto> productsMarge = new ArrayList<>();
		List<Product> allProducts = productDao.findAll();
		for (Product product : allProducts) {
			double marge = (double)(product.getPrix() - product.getPrixAchat());
			productsMarge.add(new ProductMargeDto(product.getId(), product.getNom(), marge));
		}
		return productsMarge;
	}
	
}
