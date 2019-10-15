package co.com.test.stepdefinitions;

import co.com.test.questions.Efectiva;
import co.com.test.tasks.Abrir;
import co.com.test.tasks.Reservar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
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


    @Cuando("^el ingrese el podra reservar el vuelo de (.*) a (.*) y la (.*) que deseee$")
    public void elIngreseElPodraReservarElVueloDeManizalesAMedellinYLaFechaQueDeseee(String partida, String llegada, String fecha) throws Exception {
        usuario.attemptsTo(Reservar.Vuelo(partida, llegada, fecha));

    }

    @Entonces("^el deberia ver las (.*) que es el primer vuelo$")
    public void elDeberiaVerLasHoraQueEsElPrimerVuelo(String hora) throws Exception {

        usuario.should(GivenWhenThen.seeThat(Efectiva.reserva(), Matchers.equalTo(hora)));

    }

}
