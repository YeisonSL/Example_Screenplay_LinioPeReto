package pe.linio.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

//Mapeo de elementos del para agrrgar al carrito
public class LinioProductPage extends PageObject {

	
	public static final Target ADD_PRODUCT = Target.the("Add Product Btn").located(
			By.xpath("//*[@id='buy-now'][1]"));
	public static final Target BTN_GO_CART = Target.the("page").located(By.xpath("//*[text()='Ir al carrito']")); 
}
