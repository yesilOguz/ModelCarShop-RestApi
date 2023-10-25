package com.oguzyesil.classicModels.Business;

import java.util.List;

import com.oguzyesil.classicModels.Entities.ClassicModels;

public interface IProductService {
	List<ClassicModels> getAll();
	ClassicModels getProduct(String productCode);
	void addProduct(ClassicModels model);
	void deleteProduct(ClassicModels model);
	void updateProduct(ClassicModels model);
}
