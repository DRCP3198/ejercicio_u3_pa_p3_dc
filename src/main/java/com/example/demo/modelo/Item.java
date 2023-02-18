package com.example.demo.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@NamedNativeQuery(name = "Item.ingresarItem", query = "select * from Item where itm_cod_barra= :datoBarra", resultClass = Item.class)
@Entity
@Table(name = "item")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_item")
	@SequenceGenerator(name = "seq_item", sequenceName = "seq_item", allocationSize = 1)
	@Column(name = "itm_id")
	private Integer id;

	@Column(name = "itm_codBarra")
	private String CodigoBarra;

	@Column(name = "itm_nombre")
	private String nombre;

	@Column(name = "itm_tipo")
	private String tipo;

	@Column(name = "itm_stock")
	private Integer stock;

	@Column(name = "itm_precio")
	private BigDecimal precio;

	@OneToMany(mappedBy = "items", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<DetalleFactura> detallesDos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigoBarra() {
		return CodigoBarra;
	}

	public void setCodigoBarra(String codigoBarra) {
		CodigoBarra = codigoBarra;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	

	public List<DetalleFactura> getDetallesDos() {
		return detallesDos;
	}

	public void setDetallesDos(List<DetalleFactura> detallesDos) {
		this.detallesDos = detallesDos;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", CodigoBarra=" + CodigoBarra + ", nombre=" + nombre + ", tipo=" + tipo + ", stock="
				+ stock + ", precio=" + precio + "]";
	}
	
	
	

}
