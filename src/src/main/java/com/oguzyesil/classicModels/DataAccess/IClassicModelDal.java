package com.oguzyesil.classicModels.DataAccess;

import java.util.List;

import com.oguzyesil.classicModels.Entities.ClassicModels;

public interface IClassicModelDal {
	List<ClassicModels> getAll();
	ClassicModels getProduct(String productCode);
	void addProduct(ClassicModels model);
	void deleteProduct(ClassicModels model);
	void updateProduct(ClassicModels model);
}
