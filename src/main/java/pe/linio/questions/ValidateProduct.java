package pe.linio.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static pe.linio.userinterfaces.LinioCartPage.*;

public class ValidateProduct implements Question<Boolean> {

	private String product;

	public ValidateProduct(String product) {
		this.product = product;

	}

	// Validar si el producto esta en el carrito 
	@Override
	public Boolean answeredBy(Actor actor) {
			
		return PRODUCT_IN_THE_CART.resolveFor(actor).getText().contains(product);

	}

	public static Question<Boolean> validate(String product) {
		return new ValidateProduct(product); 
	}

}