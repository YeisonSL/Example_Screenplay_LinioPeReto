package pe.linio.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static pe.linio.userinterfaces.LinioCartPage.*;
import static pe.linio.userinterfaces.LinioProductPage.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import pe.linio.interactions.GoToCart;
import pe.linio.interactions.WaitForElement;

public class ValidateProductCart implements Task {

	private String product;

	public ValidateProductCart(String product) {
		this.product = product;
	}

	// Buscar producto dentro del carrito por el nombre del producto
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitForElement.visibility(BTN_GO_CART, 3));
		actor.attemptsTo(GoToCart.the(BTN_GO_CART)); 
		actor.attemptsTo(WaitForElement.visibility(PRODUCT_IN_THE_CART, 3));
		if (PRODUCT_IN_THE_CART.resolveAllFor(actor).size() > 0
				|| !PRODUCT_IN_THE_CART.resolveAllFor(actor).isEmpty()) {
			for (int i = 0; i < PRODUCT_IN_THE_CART.resolveAllFor(actor).size(); i++) {
				if (PRODUCT_IN_THE_CART.resolveAllFor(actor).get(i).getText().contains(product)) {
					System.out.println("El producto se encuentra en el carrito");
				}
			}

		}
	}
 
	public static Performable validateProduct(String product) {
		return instrumented(ValidateProductCart.class, product);
	}
}