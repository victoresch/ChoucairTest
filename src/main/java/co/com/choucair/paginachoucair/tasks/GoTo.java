package co.com.choucair.paginachoucair.tasks;

import co.com.choucair.paginachoucair.userinterfaces.ChocairButonConvocatory;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GoTo implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(ChocairButonConvocatory.button));
		
	}

	public static GoTo convocation() {
		// TODO Auto-generated method stub
		return Tasks.instrumented(GoTo.class);
	}

}
