package co.com.test.tasks;

import co.com.test.userinterface.ExpediaHomePage;
import co.com.test.userinterface.ReservaEfectivaPage;
import com.sun.javafx.scene.control.skin.TableCellSkin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.eclipse.jetty.util.thread.Scheduler;

/**
 * Created by Candado on 14/10/2019.
 */
public class Reservar implements Task{
    private String partida;
    private String llegada;
    private String fecha;


    public Reservar(String partida, String llegada, String fecha) {
        this.partida = partida;
        this.llegada = llegada;
        this.fecha = fecha;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ExpediaHomePage.BOTON_VUELOS));
        actor.attemptsTo(Click.on(ExpediaHomePage.BOTON_VIAJE_SENCILLO));
        actor.attemptsTo(Enter.theValue(partida).into(ExpediaHomePage.CASILLA_CIUDAD_PARTIDA));
        actor.attemptsTo(Enter.theValue(llegada).into(ExpediaHomePage.CASILLA_CIUDAD_LLEGADA));
        actor.attemptsTo(Enter.theValue(fecha).into(ExpediaHomePage.FECHA_SALIDA));
        actor.attemptsTo(Click.on(ExpediaHomePage.CANTIDAD_PASAJEROS));
        actor.attemptsTo(Click.on(ExpediaHomePage.SUMAR_PASAJEROS));
        actor.attemptsTo(Click.on(ExpediaHomePage.BOTON_BUSCAR));
        actor.attemptsTo(Click.on(ReservaEfectivaPage.LISTA_DESPLEGABLE));

    }

    public static Reservar Vuelo(String partida, String llegada, String fecha) {
        return Tasks.instrumented(Reservar.class, partida, llegada, fecha);
    }
}

