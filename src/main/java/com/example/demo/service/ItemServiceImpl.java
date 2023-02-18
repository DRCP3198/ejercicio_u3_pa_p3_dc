package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Item;
import com.example.demo.repository.IItemRepo;

@Service
public class ItemServiceImpl  implements IItemService{

	@Autowired
	private IItemRepo iItemRepo;

	
	@Override
	public void ingresarItem(Item item,String codBarra) {
		// TODO Auto-generated method stub
		
		Item item2 = (Item) this.buscar(codBarra);
		if(item2.getCodigoBarra().equals(codBarra)) {
			System.out.println("Aumento un Item al stock" + (item.getStock()+1));
			
		}else {
		
			this.iItemRepo.ingresarItem(item);
		}
	}
	@Override
	public List<Item> buscar(String codBarras) {
		// TODO Auto-generated method stub
		return this.iItemRepo.buscar(codBarras);
	}

}
