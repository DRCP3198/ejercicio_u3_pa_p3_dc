package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Item;

public interface IItemRepo {
	
	
	public void ingresarItem(Item  item);
	
	public List<Item > buscar(String codBarras);

}
