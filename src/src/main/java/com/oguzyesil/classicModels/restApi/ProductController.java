package com.oguzyesil.classicModels.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oguzyesil.classicModels.Business.IProductService;
import com.oguzyesil.classicModels.Entities.ClassicModels;

@RestController
@RequestMapping("/api")
public class ProductController {
	private IProductService productService;
	
	@Autowired
	public ProductController(IProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping("/getProducts")
	List<ClassicModels> getAll(){
		return productService.getAll();
	}
	
	@GetMapping("/getProducts/{productCode}")
	ClassicModels get(@PathVariable String productCode) {
		return productService.getProduct(productCode);
	}
	
	@PostMapping("/delete")
	void delete(@RequestBody ClassicModels model) {
		productService.deleteProduct(model);
	}
	
	@PostMapping("/add")
	void add(@RequestBody ClassicModels model) {
		ClassicModels modelToAdd = model;
		
		
		productService.addProduct(modelToAdd);
	}
	
	@PostMapping("/update")
	void update(@RequestBody ClassicModels model) {
		productService.addProduct(model);
	}
	
	
}
