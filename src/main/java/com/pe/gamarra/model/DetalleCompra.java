package com.pe.gamarra.model;
import com.fasterxml.jackson.annotation.JsonInclude;

public class DetalleCompra {
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String linea;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String codigoProducto;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String descripcion;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String cantidad;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String precioCompra;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String descuento;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String importe;
	
	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public String getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(String precioCompra) {
		this.precioCompra = precioCompra;
	}

	public String getDescuento() {
		return descuento;
	}

	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}

	public String getImporte() {
		return importe;
	}

	public void setImporte(String importe) {
		this.importe = importe;
	}
	
}
