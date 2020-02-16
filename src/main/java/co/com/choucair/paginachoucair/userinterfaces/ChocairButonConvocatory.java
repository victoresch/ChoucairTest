package co.com.choucair.paginachoucair.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ChocairButonConvocatory {
	
	public static final Target button = Target.the("Boton de convocatorias").locatedBy("//*[@id=\"content\"]/div/div/div/div/div/section[2]/div/div/div[2]/div/div/div/div/div/figure/a/img");
	public static final Target keyWords = Target.the("Casilla de palabras claves").located(By.id("search_keywords"));
	public static final Target location = Target.the("Casilla de ubicación").located(By.id("search_location"));
	public static final Target buttonSearch = Target.the("Casilla de ubicación").locatedBy("//*[@id=\"content\"]/div/div/div/div/div/section[12]/div/div/div/div/div/div[2]/div/div/div/form/div[1]/div[4]/input");
	public static final Target item = Target.the("Resultado de busqueda").locatedBy("//*[@id=\"content\"]/div/div/div/div/div/section[12]/div/div/div/div/div/div[2]/div/div/div/ul/li[1]/a");
	public static final Target inscribe = Target.the("Boton inscribirse al trabajo").locatedBy("//*[@id=\"post-7767\"]/div/div[2]/div[3]/input");
}
