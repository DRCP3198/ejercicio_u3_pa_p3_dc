package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Item;

public interface IItemService {
	
	
	public void ingresarItem(Item  item,String codBarra);
	
	public List<Item > buscar(String codBarras);

}
