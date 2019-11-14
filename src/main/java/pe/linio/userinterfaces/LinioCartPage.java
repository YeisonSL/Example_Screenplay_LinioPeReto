package pe.linio.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

//Mapeo de los elemetos dentro del carrito
public class LinioCartPage extends PageObject {
	public static final Target PRODUCT_IN_THE_CART = Target.the("Product in the cart")
			.located(By.xpath("//*[contains(text(),'Xiaomi Band 4 Original')]"));
	
	public static final Target BTN_PROCESS_PURCHASE = Target.the("Product cart")
			.located(By.xpath("//*[contains(text(),'Carrito de compras')]")); 

}
