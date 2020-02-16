package co.com.choucair.paginachoucair.tasks;

import co.com.choucair.paginachoucair.userinterfaces.ChoucairJobsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheBrowser implements Task {

	@Override
	@Step("{0} El usuario abre la página de empleos de choucair ")
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub 
		actor.attemptsTo(Open.browserOn(new ChoucairJobsPage()));
	}
	
	public static OpenTheBrowser on() {
		return Tasks.instrumented(OpenTheBrowser.class);
	}
	
}
