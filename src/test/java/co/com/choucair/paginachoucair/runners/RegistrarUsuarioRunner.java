package co.com.choucair.paginachoucair.runners;

import org.junit.runner.RunWith;
import cucumber.api.SnippetType;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
					features ="src/test/resources/features/pagina_choucair.feature", 
					glue="co.com.choucair.paginachoucair.stepdefinitions",
					snippets = SnippetType.CAMELCASE
) 
public class RegistrarUsuarioRunner {
	

}
