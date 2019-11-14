package pe.linio.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import pe.linio.exceptions.WaitFor;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WaitForElement implements Interaction {

	private int tryTimes;
	private Target element;

	public WaitForElement(Target element, int tryTimes) {
		this.tryTimes = tryTimes;
		this.element = element;
	}

	// Esperar que el elemento este visible
	@Override
	public <T extends Actor> void performAs(T actor) {
		while (!(element.resolveFor(actor).isVisible() && element.resolveFor(actor).isPresent()) && tryTimes > 0) {
			actor.attemptsTo(WaitFor.seconds(1));
			tryTimes = tryTimes - 1;

		}
	}

	public static WaitForElement visibility(Target element, int tryTimes) {
		return instrumented(WaitForElement.class, element, tryTimes);

	}
}
