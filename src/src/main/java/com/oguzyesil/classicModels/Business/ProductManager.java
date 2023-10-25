package com.oguzyesil.classicModels.Business;

import java.util.List;

import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oguzyesil.classicModels.DataAccess.IClassicModelDal;
import com.oguzyesil.classicModels.Entities.ClassicModels;

@Service
public class ProductManager implements IProductService{
	
	private IClassicModelDal classicModelDal;
	
	@Autowired
	public ProductManager(IClassicModelDal classicModelDal) {
		this.classicModelDal = classicModelDal;
	}

	@Override
	@Transactional
	public List<ClassicModels> getAll() {
		List<ClassicModels> models = classicModelDal.getAll();
		
		return models;
	}

	@Override
	@Transactional
	public ClassicModels getProduct(String productCode) {
		ClassicModels model = classicModelDal.getProduct(productCode);
		
		return model;
	}

	@Override
	@Transactional
	public void addProduct(ClassicModels model) {
		classicModelDal.addProduct(model);
	}

	@Override
	@Transactional
	public void deleteProduct(ClassicModels model) {
		classicModelDal.deleteProduct(model);
		
	}

	@Override
	@Transactional
	public void updateProduct(ClassicModels model) {
		ClassicModels tryToGet = getProduct(model.getProductCode());
		Logger logger = LoggerFactory.getLogger(ProductManager.class);
		
		if(tryToGet == null) {
			logger.info("Geçmedi");
			return;
		}
		
		logger.info("Geçti");
		
		classicModelDal.updateProduct(model);
	}

}
