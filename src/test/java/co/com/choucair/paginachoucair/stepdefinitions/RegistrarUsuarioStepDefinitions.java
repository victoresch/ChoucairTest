package co.com.choucair.paginachoucair.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.choucair.paginachoucair.tasks.GoTo;
import co.com.choucair.paginachoucair.tasks.OpenTheBrowser;
import co.com.choucair.paginachoucair.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class RegistrarUsuarioStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver isBrowser;
	
	private Actor victor = Actor.named("Victor");
	
	@Before
	public void setUp() {
		victor.can(BrowseTheWeb.with(isBrowser));
	}
	
	@Given("^that user wants to register$")
	public void thatUserWantsToRegister() throws Exception {
		//Precondiciones: Haber seleccionado el trabajo al que se aspira
		
	    victor.wasAbleTo(OpenTheBrowser.on());
	    victor.wasAbleTo(GoTo.convocation());
	}


	@When("^diligence the form$")
	public void diligenceTheForm() throws Exception {
	    //Condiciones: Diligenciar el formulario
		victor.wasAbleTo(Register.user());
	}

	@Then("^see a confirmation on screen$")
	public void seeAConfirmationOnScreen() throws Exception {
	   //Poscondiciones: mensaje de confirmación exitoso
	}



}
