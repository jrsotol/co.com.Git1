package co.com.test.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.tools.ant.taskdefs.Tar;
import org.jsoup.select.Evaluator;

/**
 * Created by Candado on 14/10/2019.
 */

@DefaultUrl("https://www.expedia.com")
public class ExpediaHomePage extends PageObject{

    public static final Target BOTON_VUELOS = Target.the("Botón para elegir vuelos").located(By.xpath("//button[@id='tab-flight-tab-hp']"));
    public static final Target BOTON_VIAJE_SENCILLO = Target.the("Botón para elegir viaje sencillo").located(By.xpath("//label[@id='flight-type-one-way-label-hp-flight']"));
    public static final Target CASILLA_CIUDAD_PARTIDA = Target.the("Casilla para elegir ciudad de partida").located(By.xpath("//input[@id='flight-origin-hp-flight']"));
    public static final Target CASILLA_CIUDAD_LLEGADA = Target.the("Casilla para elegir ciudad de llegada").located(By.xpath("//input[@id='flight-destination-hp-flight']"));
    public static final Target FECHA_SALIDA = Target.the("Casilla para elegir fecha de partida").located(By.xpath("//input[@id='flight-departing-single-hp-flight']"));
    public static final Target CANTIDAD_PASAJEROS = Target.the("Botón para elegir cantidad de pasajeros").located(By.xpath("//button[@class='trigger-utility menu-trigger btn-utility btn-secondary dropdown-toggle theme-standard pin-left menu-arrow gcw-component gcw-traveler-amount-select gcw-component-initialized']"));
    public static final Target SUMAR_PASAJEROS = Target.the("Botón para sumar pasajeros a la reserva").located(By.xpath("//button[@class='uitk-step-input-button uitk-step-input-plus']"));
    public static final Target BOTON_BUSCAR = Target.the("Botón para buscar vuelos disponibles").located(By.xpath("//button[@class='btn-primary btn-action gcw-submit']"));
}
