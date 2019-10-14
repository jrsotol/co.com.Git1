package co.com.test.stepdefinitions;

import co.com.test.tasks.Abrir;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

/**
 * Created by Candado on 14/10/2019.
 */
public class ReservaVueloStepDefinition  {


    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor usuario = Actor.named("Usuario");

    @Before
    public void configuracionInicial(){

        usuario.can(BrowseTheWeb.with(hisBrowser));
    }


    @Dado("^que el usuario quiere ingresar a la pagina de expedia$")
    public void queElUsuarioQuiereIngresarALaPaginaDeExpedia() throws Exception {
    usuario.wasAbleTo(Abrir.LaPaginaDeExpedia());
    }


    @Cuando("^el ingrese el podra reservar el vuelo que deseee$")
    public void elIngreseElPodraReservarElVueloQueDeseee() throws Exception {

    }

    @Entonces("^el deberia tener una efectiva reserva$")
    public void elDeberiaTenerUnaEfectivaReserva() throws Exception {

    }

}
