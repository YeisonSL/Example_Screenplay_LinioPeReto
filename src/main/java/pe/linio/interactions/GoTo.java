package pe.linio.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoTo implements Interaction {

	// Iterracion de abrir navegador e ingresar a una URL
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.url("https://www.linio.com.pe/")

		);
	}

	public static Performable theWeb(Target theApp) {
		return instrumented(GoTo.class, theApp);
	}

}
