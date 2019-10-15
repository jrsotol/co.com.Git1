package co.com.test.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

/**
 * Created by Candado on 15/10/2019.
 */
public class ReservaEfectivaPage {
    public static final Target LISTA_DESPLEGABLE = Target.the("El botón para elegir el vuelo mas temprano").located(By.xpath("//select[@id='sortDropdown']//option[@value='leg0departuretime:asc']"));
    public static final Target AVISO_HORA_SALIDA = Target.the("Donde se lee y valida la hora de salida").located(By.xpath("//span[@data-test-id='departure-time']"));

}
