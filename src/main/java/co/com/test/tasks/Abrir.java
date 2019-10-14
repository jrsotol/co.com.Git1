package co.com.test.tasks;

import co.com.test.userinterface.ExpediaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

/**
 * Created by Candado on 14/10/2019.
 */
public class Abrir implements Task{

private ExpediaHomePage expediaHomePage;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(expediaHomePage));

    }

    public static Abrir LaPaginaDeExpedia() {
        return Tasks.instrumented(Abrir.class);
    }
}
