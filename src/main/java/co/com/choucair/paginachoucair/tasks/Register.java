package co.com.choucair.paginachoucair.tasks;

import co.com.choucair.paginachoucair.userinterfaces.ChocairButonConvocatory;
import co.com.choucair.paginachoucair.userinterfaces.ChoucairJobsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(
						Enter.theValue("Analista").into(ChocairButonConvocatory.keyWords),
						Enter.theValue("Medellin").into(ChocairButonConvocatory.location),
						Click.on(ChocairButonConvocatory.buttonSearch),
						Click.on(ChocairButonConvocatory.item)
						/*Click.on(ChocairButonConvocatory.inscribe)*/);
		
	}

	public static Register user() {
		// TODO Auto-generated method stub
		return Tasks.instrumented(Register.class);
	} 
	
	 

}
