package pe.linio.exceptions;

import static pe.linio.userinterfaces.LinioCartPage.*;

public class UnexpectedProduct extends Error {

	public static final String UNEXPECTED_PRODUCT_CART = "No se agrego el producto" + PRODUCT_IN_THE_CART
			+ " al carrito";

	// Mensaje que se retorna cuando no se cumple la ccondicion que el producto no
	// se agregro al carrito
	public UnexpectedProduct(String message, Throwable cause) {
		super(message, cause);  
	}
}
