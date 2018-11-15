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
		List<ProductMargeDto> res = new ArrayList<>();
		List<Product> allProducts = productDao.findAll();
		for (Product product : allProducts) {
			double marge = (double)(product.getPrix() - product.getPrixAchat());
			res.add(new ProductMargeDto(product.getId(), product.getNom(), marge));
		}
		return res;
	}
	
//	public Product saveProduct(Product product) {
//		if(product.getPrix() == 0) throw new ProduitGratuitException("le prix de vente Zero non autorisé");
//		return productDao.save(product);
//	}
}
