package com.oguzyesil.classicModels.DataAccess;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.oguzyesil.classicModels.Entities.ClassicModels;

import jakarta.persistence.EntityManager;

@Repository
public class HibernateClassicModelDal implements IClassicModelDal {
	
	private EntityManager entityManager;
	
	// since we only have hibernate, 
	// it will give us hibernate automatically
	@Autowired
	public HibernateClassicModelDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<ClassicModels> getAll() {
		Session session = entityManager.unwrap(Session.class);
		
		List<ClassicModels> models = session.createQuery("from ClassicModels", ClassicModels.class)
				.getResultList();
		
		return models;
	}

	@Override
	public ClassicModels getProduct(String productCode) {
		Session session = entityManager.unwrap(Session.class);
		
		ClassicModels model = session.get(ClassicModels.class, productCode);
		
		return model;
	}

	@Override
	public void addProduct(ClassicModels model) {
		Session session = entityManager.unwrap(Session.class);
		
		session.saveOrUpdate(model);
		
	}

	@Override
	public void deleteProduct(ClassicModels model) {
		Session session = entityManager.unwrap(Session.class);
		
		//session.delete(model);
		session.delete(entityManager.contains(model) ? model : entityManager.merge(model));
	}

	@Override
	public void updateProduct(ClassicModels model) {
		Session session = entityManager.unwrap(Session.class);
		
		session.saveOrUpdate(model);
	}

}
