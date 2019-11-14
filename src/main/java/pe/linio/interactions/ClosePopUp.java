package pe.linio.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.targets.Target;

public class ClosePopUp implements Interaction {
	private Target element;

	public ClosePopUp(Target element) {

		this.element = element;
	}

//Interaccion para cerrar mensaje de alerta
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Check.whether(element.resolveFor(actor).isPresent()).andIfSo(Click.on(element)));

	}

	public static ClosePopUp closePopUp(Target element) {
		return instrumented(ClosePopUp.class, element);

	}
}
