package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.dto.FacturaDTO;
import com.example.demo.repository.IFacturaRepo;

@Service
public class FacturaServiceImpl implements IFacturaService{

	@Autowired
	private IFacturaRepo facturaRepo;
	@Override
	public void agregarFactura(FacturaDTO factura) {
		// TODO Auto-generated method stub
		this.facturaRepo.agregarFactura(factura);
	}
	
	
	

}
