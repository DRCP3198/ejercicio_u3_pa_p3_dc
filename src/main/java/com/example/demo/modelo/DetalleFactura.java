package com.example.demo.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name ="detalle")
public class DetalleFactura {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "deta_seq")
	@SequenceGenerator(name = "deta_seq",sequenceName = "deta_seq",allocationSize = 1)
	@Column(name ="deta_id")
     private Integer id;
	
	@Column(name ="deta_cantidad")
     private Integer cantidad;
	
	@Column(name ="deta_precioUnitario")
	 private BigDecimal precioUnitario;
	
	@Column(name ="deta_subtotal")
	 private BigDecimal subTotal;
	
	@ManyToOne()
	@JoinColumn(name= "deta_id_item") 
	private Item items;
	
	
	@ManyToOne()
	@JoinColumn(name= "deta_id_factura") 
	private Factura itemsF;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getCantidad() {
		return cantidad;
	}


	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}


	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}


	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}


	public BigDecimal getSubTotal() {
		return subTotal;
	}


	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}


	public Item getItems() {
		return items;
	}


	public void setItems(Item items) {
		this.items = items;
	}


	public Factura getItemsF() {
		return itemsF;
	}


	public void setItemsF(Factura itemsF) {
		this.itemsF = itemsF;
	}


	@Override
	public String toString() {
		return "DetalleFactura [id=" + id + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario
				+ ", subTotal=" + subTotal + "]";
	}
	
	
	
	
	/*@Column(name ="deta_idVenta")
	 private Integer idVenta;
	
	@Column(name ="deta_idProducto")
	 private Integer idProducto;*/

}
