package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Item;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class ItemRepoImpl implements IItemRepo {

	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresarItem(Item item) {
		// TODO Auto-generated method stub
		this.entityManager.persist(item);
		
	}
	@Override
	public List<Item> buscar(String codBarras) {
		// TODO Auto-generated method stub
		TypedQuery<Item> typedQuery = this.entityManager.createNamedQuery("Item.ingresarItem", Item.class);
		typedQuery.setParameter("datoBarra", codBarras);
		return typedQuery.getResultList();
	}

}
