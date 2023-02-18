package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Factura;
import com.example.demo.modelo.dto.FacturaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class FacturaRepoImpl implements IFacturaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void agregarFactura(FacturaDTO factura) {
		// TODO Auto-generated method stub
		this.entityManager.persist(factura);
	}

}
