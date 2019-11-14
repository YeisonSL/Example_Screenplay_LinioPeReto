package pe.linio.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SelectNameProduct implements Interaction {

	private Target element;
	private String product;

	public SelectNameProduct(Target element, String product) {
		this.element = element;
		this.product = product;

	}

	// Buscar el nombre del producto y darle clik
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitForElement.visibility(element, 3));
		if (element.resolveAllFor(actor).size() > 0 || !element.resolveAllFor(actor).isEmpty()) {
			for (int i = 0; i < element.resolveAllFor(actor).size(); i++) {
				if (element.resolveAllFor(actor).get(i).getText().contains(product)) {
					 actor.attemptsTo(Click.on(element));
				}
			}
		} else {
			System.out.println("Producto no encontrado");
		}
	}

	public static SelectNameProduct selectProduct(Target element, String product) {
		return instrumented(SelectNameProduct.class, element, product);

	}
}
