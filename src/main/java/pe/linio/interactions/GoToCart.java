package pe.linio.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class GoToCart implements Task {

	private Target elementGoCart;

	public GoToCart( Target elementGoCart) {
		this.elementGoCart = elementGoCart;
		
	}

	// Iterraciones para ir al carrito de compras
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(elementGoCart));
		
	}

	public static GoToCart the(Target elementGoCart) {
		return instrumented(GoToCart.class, elementGoCart);
	}
}
