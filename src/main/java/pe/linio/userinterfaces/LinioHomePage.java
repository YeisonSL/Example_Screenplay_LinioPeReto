package pe.linio.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

//Mapeo de elementos del Home de la pagina
public class LinioHomePage extends PageObject {

	public static final Target POP_UP = Target.the("Privacy Pop Up").located(By.className("dy-lb-close"));
	public static final Target SEARCH = Target.the("Search Input").located(By.xpath("//div[@class='input-group'] / child :: input"));
	public static final Target CART_BUTTON = Target.the("Cart Button")
			.located(By.className("'btn btn-sm btn-go-to-cart added-product"));

}
