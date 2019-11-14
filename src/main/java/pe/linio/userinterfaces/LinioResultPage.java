package pe.linio.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

//Mapeo de elementos del resultado de busqueda
public class LinioResultPage extends PageObject {
	public static final Target LIST_OF_PRODUCTS = Target.the("List result").located(By.className("title-section"));

}
