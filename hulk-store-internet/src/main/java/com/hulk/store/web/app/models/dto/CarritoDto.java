package com.hulk.store.web.app.models.dto;

import com.hulk.store.web.app.models.entity.Producto;

public class CarritoDto {
	private Producto producto;
	private Integer cantidad;
	private Double costo;
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Double getCosto() {
		return costo;
	}
	public void setCosto(Double costo) {
		this.costo = costo;
	}
	
	
	

}
