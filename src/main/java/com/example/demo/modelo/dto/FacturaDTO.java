package com.example.demo.modelo.dto;

import java.util.List;

import com.example.demo.modelo.Item;

public class FacturaDTO {
	
	private List<Item> listaArticulos;
	private String cedula;
	private String numVenta;
	
	
	public FacturaDTO() {
		
	}
	public FacturaDTO(List<Item> listaArticulos, String cedula, String numVenta) {
		super();
		this.listaArticulos = listaArticulos;
		this.cedula = cedula;
		this.numVenta = numVenta;
	}
	public List<Item> getListaArticulos() {
		return listaArticulos;
	}
	public void setListaArticulos(List<Item> listaArticulos) {
		this.listaArticulos = listaArticulos;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNumVenta() {
		return numVenta;
	}
	public void setNumVenta(String numVenta) {
		this.numVenta = numVenta;
	}
	
	
	

}
