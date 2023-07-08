package com.pe.gamarra.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pe.gamarra.model.DetalleCompra;
import com.pe.gamarra.model.RegistroCompraRequest;

@RestController
@RequestMapping("/compramanagement/v1")
public class CompraManagementController {

	// --HU005 Registrar proceso compra

	@PostMapping("/registrarcompra")
	@ResponseStatus(HttpStatus.OK)
	public Object registrarCompra(@RequestBody RegistroCompraRequest request) {

		List<DetalleCompra> listDetalle = request.getDetalleCompra();
		DetalleCompra detCompra = new DetalleCompra();
		detCompra.setDescuento("10");
		detCompra.setImporte("30");
		detCompra.setLinea(listDetalle.get(0).getLinea());
		DetalleCompra detCompra1 = new DetalleCompra();
		detCompra1.setDescuento("5");
		detCompra1.setImporte("5");
		detCompra1.setLinea(listDetalle.get(1).getLinea());
		listDetalle.set(0, detCompra);
		listDetalle.set(1, detCompra1);
		request.setDetalleCompra(listDetalle);
		request.setTotal("40");
		request.setIgv("10");
		request.setTotalIGV("50");
		return request;

	}

	// --HU001 Agregar productos al carrito

	@PostMapping("/agregarcarrito")
	@ResponseStatus(HttpStatus.OK)
	public Object agregarProductoCarrito(@RequestBody RegistroCompraRequest request) {

		List<DetalleCompra> listDetalle = request.getDetalleCompra();
		DetalleCompra detCompra = new DetalleCompra();
		detCompra.setDescuento("10");
		detCompra.setImporte("30");
		detCompra.setLinea(listDetalle.get(0).getLinea());
		DetalleCompra detCompra1 = new DetalleCompra();
		detCompra1.setDescuento("5");
		detCompra1.setImporte("5");
		detCompra1.setLinea(listDetalle.get(1).getLinea());
		listDetalle.set(0, detCompra);
		listDetalle.set(1, detCompra1);
		request.setDetalleCompra(listDetalle);
		request.setTotal("40");
		request.setIgv("10");
		request.setTotalIGV("50");
		return request;

	}

}
