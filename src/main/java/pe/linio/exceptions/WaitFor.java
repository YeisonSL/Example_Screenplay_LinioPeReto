package pe.linio.exceptions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WaitFor implements Task {

	private int seconds;

	public WaitFor(int seconds) {
		this.seconds = seconds;
	}

	// Realizar una espera de un elemento
	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			Thread.sleep(this.seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static WaitFor seconds(int seconds) {
		return instrumented(WaitFor.class, seconds);
	}
}
