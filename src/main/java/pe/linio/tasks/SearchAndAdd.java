package pe.linio.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import pe.linio.interactions.AddProduct;
import pe.linio.interactions.ClosePopUp;
import pe.linio.interactions.WaitForElement;
import pe.linio.interactions.WriteProductAndSearch;

import static pe.linio.userinterfaces.LinioHomePage.POP_UP;
import static pe.linio.userinterfaces.LinioHomePage.SEARCH;
import static pe.linio.userinterfaces.LinioResultPage.LIST_OF_PRODUCTS;
import static pe.linio.userinterfaces.LinioProductPage.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchAndAdd implements Task {

	private String product;

	public SearchAndAdd(String product) {
		this.product = product;
	}

	// Buscar producto y agrrgarlo al carrito
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		//actor.attemptsTo(WaitForElement.visibility(POP_UP, 3));
		//actor.attemptsTo(ClosePopUp.closePopUp(POP_UP));
		actor.attemptsTo(WriteProductAndSearch.writeiInThePage(product, SEARCH));
		actor.attemptsTo(AddProduct.theProduct(LIST_OF_PRODUCTS, product, ADD_PRODUCT));

	}

	public static Performable seachTheProduct(String product) {
		return instrumented(SearchAndAdd.class, product);
	}
}