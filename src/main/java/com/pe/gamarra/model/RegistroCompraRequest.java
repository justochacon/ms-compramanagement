package com.pe.gamarra.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

public class RegistroCompraRequest {
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String numPedido;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String fecha;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String tienda;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String tipoPago;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private List<DetalleCompra> detalleCompra;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String total;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String igv;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String totalIGV;

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getIgv() {
		return igv;
	}

	public void setIgv(String igv) {
		this.igv = igv;
	}

	public String getTotalIGV() {
		return totalIGV;
	}

	public void setTotalIGV(String totalIGV) {
		this.totalIGV = totalIGV;
	}

	public String getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(String numPedido) {
		this.numPedido = numPedido;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTienda() {
		return tienda;
	}

	public void setTienda(String tienda) {
		this.tienda = tienda;
	}

	public String getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

	public List<DetalleCompra> getDetalleCompra() {
		return detalleCompra;
	}

	public void setDetalleCompra(List<DetalleCompra> detalleCompra) {
		this.detalleCompra = detalleCompra;
	}

}
